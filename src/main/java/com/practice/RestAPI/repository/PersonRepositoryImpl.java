package com.practice.RestAPI.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl implements IPersonRepository {
    @Override
    public String getPerson() {
        return "From repo";
    }
}
