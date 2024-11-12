package com.practice.RestAPI.repository;

import com.practice.RestAPI.entity.PersonDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<PersonDAO, Integer> {

}
