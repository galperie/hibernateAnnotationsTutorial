package hibernateTutorial.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue
    @Column(name="employee_id")
    private Long id;

    private String firstName;

    private String lastName;
}