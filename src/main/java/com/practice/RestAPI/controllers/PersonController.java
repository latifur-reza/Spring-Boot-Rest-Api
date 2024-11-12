package com.practice.RestAPI.controllers;

import com.practice.RestAPI.entity.PersonDAO;
import com.practice.RestAPI.services.IPersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private final IPersonService personService;

    public PersonController(IPersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<PersonDAO> get() {
        return personService.getPerson();
    }

    @PostMapping("/person")
    public PersonDAO add(@RequestBody PersonDAO personDAO) {
        return personService.addPerson(personDAO);
    }

    @PutMapping("person/update/{id}")
    public PersonDAO update(@PathVariable int id, @RequestBody PersonDAO personDAO) {
        return personService.updatePerson(id, personDAO);
    }

    @DeleteMapping("person/delete/{id}")
    public void delete(@PathVariable int id) {
        personService.deletePerson(id);
    }
}
