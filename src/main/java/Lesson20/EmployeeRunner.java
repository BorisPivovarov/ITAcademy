package Lesson20;

import Lesson14.Util.NameUtils;
import Lesson14.Util.PhoneUtils;
import Lesson20.Employee.Department;
import Lesson20.Employee.Employee;
import Lesson20.Employee.Position;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXB;
import jakarta.xml.bind.JAXBException;
import lombok.SneakyThrows;
import lombok.val;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class EmployeeRunner {

    private static final List<Department> DEPARTMENT_LIST =
            List.of(new Department("Department ob not your dog affairs", "Moscow"),
                    new Department("Higher ranks", "Kazan"),
                    new Department("Simple dudes", "Budapest"));

    private static final List<Position> POSITION_LIST =
            List.of(new Position("Director", new BigDecimal(100000)),
                    new Position("Accountant", new BigDecimal(40000)),
                    new Position("Assistant", new BigDecimal(25000)),
                    new Position("Capable dude", new BigDecimal(95000)));

    private static final TypeReference<EmployeeWrapper> TR = new TypeReference<>() {
    };
    private static int COUNTER = 1;

    public static void main(String[] args) throws JAXBException, IOException {

        val FILE_LOCATION = "D://test/employee.xml";

        System.out.println("Start");
        EmployeeWrapper employeeWrapper = new EmployeeWrapper(List.of(getEmployee(),
                getEmployee(),
                getEmployee(),
                getEmployee(),
                getEmployee(),
                getEmployee(),
                getEmployee(),
                getEmployee()));
        System.out.println("Create parent directory");
        Path path = Paths.get(FILE_LOCATION);
        Path parent = path.getParent();
        if (!parent.toFile().exists()) {
            parent.toFile().mkdirs();
        }
        System.out.printf("Marshalling to %s\n", path.getFileName());
        JAXB.marshal(employeeWrapper, path.toFile());
        Document document = getDocument(path.toFile());
        Integer avgSalary = getAvgSalary(document);
        System.out.printf("Searching for employees with a salary value above the average %d\n", avgSalary);
        List<String> employeeList = searchAvg(document, avgSalary);
        System.out.println(employeeList);
        String json = XML.toJSONObject(String.join("", Files.readAllLines(path))).toString();
        Path jsonPath = parent.resolve("employee.json");
        System.out.printf("Save to %s\n", jsonPath.getFileName());
        Files.writeString(jsonPath, json, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        System.out.println("Output information about employees in odd positions");
        List<Employee> oddEmployees = getOddEmployees(jsonPath);
        System.out.println(oddEmployees);
    }

    @SneakyThrows
    private static List<Employee> getOddEmployees(Path jsonPath) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        EmployeeWrapper employeesFromJson = objectMapper.readValue(jsonPath.toFile(), TR);
        return employeesFromJson.getEmployees().stream().
                filter(employee -> employeesFromJson.getEmployees().indexOf(employee) % 2 == 1).collect(Collectors.toList());
    }

    @SneakyThrows
    private static List<String> searchAvg(Document document, int salary) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        NodeList nodeList = (NodeList) xPathFactory.newXPath().compile("//employee/position[@salary > " + salary + "]/ancestor::employee/surname/text()").evaluate(document, XPathConstants.NODESET);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            result.add(nodeList.item(i).getNodeValue());
        }
        return result;
    }

    @SneakyThrows
    private static Integer getAvgSalary(Document document) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        Double result = (Double) xPathFactory.newXPath().compile("sum(//position/@salary)" +
                " div count(//position)").evaluate(document, XPathConstants.NUMBER);
        return result != null ? result.intValue() : 0;
    }

    @SneakyThrows
    private static Document getDocument(File file) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        return documentBuilder.parse(file);
    }


    private static Employee getEmployee() {
        return new Employee().setLogin("user00" + COUNTER++).
                setName(NameUtils.randomizeName()).
                setSurname(NameUtils.randomizeSurname()).
                setPatronymic(NameUtils.randomizePatronymic()).setPersonalNumber(PhoneUtils.generatePhone()).
                setDepartment(DEPARTMENT_LIST.get(new Random().nextInt(DEPARTMENT_LIST.size()))).
                setPosition(POSITION_LIST.get(new Random().nextInt(POSITION_LIST.size())));
    }
}
