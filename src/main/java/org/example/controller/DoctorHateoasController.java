package org.example.controller;

import org.example.model.Doctor;
import org.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class DoctorHateoasController {
    @Autowired private DoctorService doctorService;
    @Autowired DoctorModelAssembler assembler;
    @GetMapping("/doctors")
    public CollectionModel<EntityModel<Doctor>> getDoctors(){
        return assembler.toCollectionModel(doctorService.getDoctors());
    }
    @GetMapping("/doctor/{id}")
    public EntityModel<Doctor> getDoctorbyId(@PathVariable Long id){
       return assembler.toModel(doctorService.readDoctor(id));
    }

}
