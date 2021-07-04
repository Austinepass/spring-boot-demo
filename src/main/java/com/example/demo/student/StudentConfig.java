package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student austine = new Student(
                    "Austine",
                    "austine@gmail.com",
                    LocalDate.of(2000, APRIL, 6)
            );
            Student king = new Student(
                    "King",
                    "king@gmail.com",
                    LocalDate.of(2003, APRIL, 6)
            );
            repository.saveAll(List.of(austine, king));

        };
    }
}
