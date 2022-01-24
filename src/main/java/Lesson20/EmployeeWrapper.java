package Lesson20;

import Lesson20.Employee.Employee;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = EmployeeWrapper.Fields.employees)
@JsonRootName(value = EmployeeWrapper.Fields.employees)
public class EmployeeWrapper {

    @XmlElement(name = "employee")
    @JsonProperty("employee")
    public List<Employee> employees;
}
