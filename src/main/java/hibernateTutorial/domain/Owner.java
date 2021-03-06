package hibernateTutorial.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Owner {

    @Id
    @GeneratedValue
    @Column(name="owner_id")
    private Long id;

    private String firstName;

    private String lastName;
}
