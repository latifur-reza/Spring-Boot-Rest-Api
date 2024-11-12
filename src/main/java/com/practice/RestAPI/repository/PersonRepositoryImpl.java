package com.practice.RestAPI.repository;

import com.practice.RestAPI.entity.PersonDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class PersonRepositoryImpl implements IPersonRepository {

}
