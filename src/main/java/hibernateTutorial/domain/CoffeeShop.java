package hibernateTutorial.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CoffeeShop {

    @Id
    @GeneratedValue
    @Column(name="shop_id")
    private Long id;

    private String name;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="owner_id")
    private Owner owner;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Employee> employees;
}