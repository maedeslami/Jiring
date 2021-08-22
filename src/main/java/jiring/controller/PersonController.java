package jiring.controller;

import jiring.entity.Person;
import jiring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenovo on 8/15/2021.
 */
@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("/save")
    public Person save(@RequestBody Person person) {
        return personService.save(person);

    }

}
