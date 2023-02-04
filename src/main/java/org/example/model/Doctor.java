package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;
@Entity
@Table(name= "doctors")
public class Doctor {
   @Id @GeneratedValue
    private Long id;
    private String name;
    private String speciality;
    //private List<Patient> patienList;


    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;

    }

    public Doctor(Long id, String name, String speciality ) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    protected Doctor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + speciality +
                '}';
    }
}
