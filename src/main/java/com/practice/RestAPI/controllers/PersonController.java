package com.practice.RestAPI.controllers;

import com.practice.RestAPI.services.IPersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final IPersonService personService;

    public PersonController(IPersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    public String getUsers(){
        return personService.getPerson();
    }
}
