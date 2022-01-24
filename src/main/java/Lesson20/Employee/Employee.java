package Lesson20.Employee;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    @XmlAttribute
    private String personalNumber;
    @XmlAttribute
    private String login;
    private String name;
    private String patronymic;
    private String surname;

    private Position position;
    private Department department;
}
