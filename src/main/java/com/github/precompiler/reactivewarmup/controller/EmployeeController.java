package com.github.precompiler.reactivewarmup.controller;

import com.github.precompiler.reactivewarmup.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.Stream;

/**
 * @author Richard Li
 */
@Slf4j
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @GetMapping("/{id}")
    public Mono<Employee> getEmployeeById(@PathVariable(name = "id") String id) {
        log.info("getEmployeeById");
        return Mono.just(new Employee("emp1", "Scott", "Tiger", "scott.tiger@oracle.com"));
    }

    @GetMapping
    public Flux<Employee> getEmployees() {
        log.info("getEmployees");
        return Flux.fromStream(Stream.of(new Employee("emp1", "Scott", "Tiger", "scott.tiger@oracle.com"),
                new Employee("emp2", "John", "Doe", "john.doe@oracle.com")));
    }
}
