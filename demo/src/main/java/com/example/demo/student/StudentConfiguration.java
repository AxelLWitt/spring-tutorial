package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student bill = new Student(
                    "Bill",
                    "bill.nye@mail.com",
                    21,
                    LocalDate.of(2000, 10, 4)
            );
            Student alex = new Student(
                    "alex",
                    "alex.nye@mail.com",
                    25,
                    LocalDate.of(1995, 10, 4)
            );
            repository.saveAll(
                    List.of(bill, alex)
            );
        };
    }
}
