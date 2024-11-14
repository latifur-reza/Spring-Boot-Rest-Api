package com.practice.RestAPI.repository;

import com.practice.RestAPI.entity.FacultyDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacultyRepository extends JpaRepository<FacultyDAO, Integer> {
}
