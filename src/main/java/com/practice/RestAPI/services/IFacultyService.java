package com.practice.RestAPI.services;

import com.practice.RestAPI.entity.FacultyDAO;

import java.util.List;

public interface IFacultyService {

    public List<FacultyDAO> getFaculties();
    public FacultyDAO getFaculty(Integer id);
    public FacultyDAO addFaculty(FacultyDAO facultyDAO);
    public FacultyDAO updateFaculty(Integer id, FacultyDAO facultyDAO);
    public void deleteFaculty(Integer id);
}
