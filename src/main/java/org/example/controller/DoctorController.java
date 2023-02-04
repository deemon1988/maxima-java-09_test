package org.example.controller;

import org.example.model.Doctor;
import org.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public List<Doctor> getAll() {
        return doctorService.getDoctors();
    }

    @GetMapping("/doctors/{id}")
    public ResponseEntity<Doctor> getOne(@PathVariable Long id) {
        return ResponseEntity.ok(doctorService.readDoctor(id));
    }

    @PostMapping("/doctor")
    public ResponseEntity<Doctor> add(@RequestBody Doctor doctor) {
        doctorService.saveDoctor(doctor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/doctors/{id}")
    public void delete(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
    }

    @PutMapping("/doctor/{id}")
    public ResponseEntity<Doctor> update(@PathVariable Long id, @RequestBody Doctor doctor) {
        boolean updated = doctorService.update(id, doctor);

        return updated ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);

    }
}
