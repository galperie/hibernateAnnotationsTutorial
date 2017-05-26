package hibernateTutorial.controller;

import hibernateTutorial.domain.CoffeeShop;
import hibernateTutorial.repository.CoffeeShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class CoffeeShopController {

    @Autowired
    private CoffeeShopRepository coffeeShopRepository;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> add(@RequestBody CoffeeShop coffeeShop) {
        CoffeeShop updatedShop = coffeeShopRepository.save(coffeeShop);
        return new ResponseEntity<Object>(updatedShop, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> hello() {
        return new ResponseEntity<Object>("all good", HttpStatus.OK);
    }
}
