package com.springrest.springrest.jparepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DBOperationRunner implements CommandLineRunner {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.saveAll(List.of(
                new Employee(1001,"James",2599.5,"HR"),
                new Employee(1002,"Elizabeth",2999.0,"Admin"))
        );
    }
}
