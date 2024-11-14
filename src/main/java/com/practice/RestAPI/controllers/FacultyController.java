package com.practice.RestAPI.controllers;

import com.practice.RestAPI.entity.FacultyDAO;
import com.practice.RestAPI.services.IFacultyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {

    private final IFacultyService facultyService;
    public FacultyController(IFacultyService facultyService){
        this.facultyService = facultyService;
    }

    @GetMapping("/faculties")
    public List<FacultyDAO> get(){
        return facultyService.getFaculties();
    }

    @GetMapping("/faculties/{id}")
    public FacultyDAO getOne(@PathVariable int id){
        return facultyService.getFaculty(id);
    }

    @PostMapping("/faculty")
    public FacultyDAO add(@RequestBody FacultyDAO facultyDAO){
        return facultyService.addFaculty(facultyDAO);
    }

    @PutMapping("/faculty/update/{id}")
    public FacultyDAO update(@PathVariable int id, @RequestBody FacultyDAO facultyDAO){
        return facultyService.updateFaculty(id, facultyDAO);
    }

    @DeleteMapping("/faculty/delete/{id}")
    public void delete(@PathVariable int id){
        facultyService.deleteFaculty(id);
    }
}
