package org.example.controller;

import org.example.model.Doctor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
@Component
public class DoctorModelAssembler implements RepresentationModelAssembler<Doctor, EntityModel<Doctor>> {
    @Override
    public EntityModel<Doctor> toModel(Doctor entity) {
         return EntityModel.of(entity,
                linkTo(methodOn(DoctorHateoasController.class).getDoctorbyId(entity.getId())).withSelfRel(),
                 linkTo(methodOn(DoctorHateoasController.class).getDoctors()).withRel("band")
        );
    }

    @Override
    public CollectionModel<EntityModel<Doctor>> toCollectionModel(Iterable<? extends Doctor> entities) {
        List<EntityModel<Doctor>> doctors = new ArrayList<>();
        for (Doctor entity: entities) {
                doctors.add(toModel(entity));
        }
        return CollectionModel.of(doctors,
                linkTo(methodOn(DoctorHateoasController.class).getDoctors()).withSelfRel()
        );
    }
}
