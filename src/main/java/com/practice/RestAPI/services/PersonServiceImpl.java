package com.practice.RestAPI.services;

import com.practice.RestAPI.controllers.PersonController;
import com.practice.RestAPI.entity.PersonDAO;
import com.practice.RestAPI.repository.IPersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonRepository personRepository;

    public PersonServiceImpl(IPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonDAO> getPerson() {
        return personRepository.findAll();
    }

    @Override
    public PersonDAO addPerson(PersonDAO personDAO) {
        return personRepository.save(personDAO);
    }

    @Override
    public PersonDAO updatePerson(Integer id, PersonDAO personDAO) {
        PersonDAO newPerson = personRepository.findById(id).get();
        newPerson.setName(personDAO.getName());
        newPerson.setGender(personDAO.getGender());
        personRepository.save(newPerson);

        return newPerson;
    }

    @Override
    public void deletePerson(Integer id) {
        personRepository.deleteById(id);
    }

}
