package org.example;

import org.example.config.SpringConfig;
import org.example.model.Doctor;
import org.example.model.Patient;
import org.example.repository.DoctorRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

      /*  ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

       DoctorRepository repoDoc = context.getBean(DoctorRepository.class);

        List<Patient> patientList = new ArrayList<>();
        Doctor sander = new Doctor("Dr. Sanders", "General");
        repoDoc.save(sander);

        repoDoc.findAll().forEach(System.out::println);*/




    }
}
