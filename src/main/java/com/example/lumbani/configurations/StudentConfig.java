package com.example.lumbani.configurations;

import com.example.lumbani.models.Student;
import com.example.lumbani.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
           Student Lumbani =  new Student(
                    "Lumbani",
                    "makumbilumbani7@gmail.com",
                    LocalDate.of(2001, Month.MAY,25)
            );
            Student Clement =  new Student(
                    "Clement",
                    "mphepo@gmail.com",
                    LocalDate.of(2000, Month.MAY,5)
            );
            Student Shicco =  new Student(
                    "Shicco",
                    "shicco@gmail.com",
                    LocalDate.of(2003, Month.MAY,5)
            );
            Student Daniel =  new Student(
                    "Daniel",
                    "daniel@gmail.com",
                    LocalDate.of(2009, Month.MAY,5)
            );

            studentRepository.saveAll(
                    List.of(Lumbani,Clement,Shicco,Daniel)
            );
        };
    }
}
