package com.practice.RestAPI.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "faculties")
public class FacultyDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String initial;
    private String email;

    public FacultyDAO(){

    }
    public FacultyDAO(int id, String name, String initial, String email){
        this.id = id;
        this.name = name;
        this.initial= initial;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
