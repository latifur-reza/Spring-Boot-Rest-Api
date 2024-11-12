package com.practice.RestAPI.services;

import com.practice.RestAPI.entity.PersonDAO;

import java.util.List;

public interface IPersonService {
    public List<PersonDAO> getPerson();
    public PersonDAO addPerson(PersonDAO personDAO);
    public PersonDAO updatePerson(Integer id, PersonDAO personDAO);
    public void deletePerson(Integer id);
}
