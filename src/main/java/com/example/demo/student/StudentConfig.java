package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {
            Student diana = new Student(
                    "Diana Eftaiha",
                    "dianaeftaiha@gmail.com",
                    LocalDate.of(1983, JULY, 24)
            );

            Student joe = new Student(
                    "Joe MacMillan",
                    "joemacmillan@gmail.com",
                    LocalDate.of(1980, JANUARY, 5)
            );

            repository.saveAll(
                    List.of(diana, joe)
            );
        };
    }
}
