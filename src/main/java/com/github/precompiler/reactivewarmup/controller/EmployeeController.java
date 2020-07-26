package com.github.precompiler.reactivewarmup.controller;

import com.github.precompiler.reactivewarmup.model.Employee;
import com.github.precompiler.reactivewarmup.repo.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Employee> createEmployee(@RequestBody Employee employee) {
        log.info("createEmployee");
        return employeeRepository.save(employee);
    }

    private EmployeeRepository employeeRepository;
}
