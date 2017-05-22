package hibernateTutorial.repository;

import hibernateTutorial.domain.CoffeeShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeShopRepository extends JpaRepository<CoffeeShop, Long> {
}
