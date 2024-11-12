package com.practice.RestAPI.services;

import com.practice.RestAPI.repository.IPersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonRepository personRepository;

    public PersonServiceImpl(IPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public String getPerson() {
        return personRepository.getPerson();
    }
}
