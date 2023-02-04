package org.example.repository;

import org.example.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
  // public List<Doctor> getDoctorByIdWithPatients(Long id);
}
