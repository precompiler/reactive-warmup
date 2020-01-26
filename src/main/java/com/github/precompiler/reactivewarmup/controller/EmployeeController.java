package com.github.precompiler.reactivewarmup.controller;

import com.github.precompiler.reactivewarmup.model.Employee;
import com.github.precompiler.reactivewarmup.repo.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * @author Richard Li
 */
@Slf4j
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping("/{id}")
    public Mono<Employee> getEmployeeById(@PathVariable(name = "id") Integer id) {
        log.info("getEmployeeById");
        return employeeRepository.findById(id);
    }

    @GetMapping
    public Flux<Employee> getEmployees() {
        log.info("getEmployees");
        return employeeRepository.findAll();
    }

    private EmployeeRepository employeeRepository;
}
