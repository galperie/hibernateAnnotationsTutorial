package hibernateTutorial.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Controller {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> update() {
        return new ResponseEntity<Object>("all good", HttpStatus.OK);
    }

}
