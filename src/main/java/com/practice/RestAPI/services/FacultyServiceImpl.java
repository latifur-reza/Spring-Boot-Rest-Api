package com.practice.RestAPI.services;

import com.practice.RestAPI.entity.FacultyDAO;
import com.practice.RestAPI.repository.IFacultyRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class FacultyServiceImpl implements IFacultyService{


    private final IFacultyRepository facultyRepository;

    public FacultyServiceImpl(IFacultyRepository facultyRepository){
        this.facultyRepository = facultyRepository;
    }

    @Override
    public List<FacultyDAO> getFaculties() {
        return facultyRepository.findAll();
    }

    @Override
    public FacultyDAO getFaculty(Integer id) {
        return facultyRepository.findById(id).get();
    }

    @Override
    public FacultyDAO addFaculty(FacultyDAO facultyDAO) {
        return facultyRepository.save(facultyDAO);
    }

    @Override
    public FacultyDAO updateFaculty(Integer id, FacultyDAO facultyDAO) {
        FacultyDAO matchedFaculty = facultyRepository.findById(id).get();
        matchedFaculty.setName(facultyDAO.getName());
        matchedFaculty.setInitial(facultyDAO.getInitial());
        matchedFaculty.setEmail(facultyDAO.getEmail());
        facultyRepository.save(matchedFaculty);
        return matchedFaculty;
    }

    @Override
    public void deleteFaculty(Integer id) {
        facultyRepository.deleteById(id);
    }
}
