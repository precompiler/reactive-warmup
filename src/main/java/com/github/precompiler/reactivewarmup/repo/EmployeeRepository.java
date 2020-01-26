package com.github.precompiler.reactivewarmup.repo;

import com.github.precompiler.reactivewarmup.model.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author Richard Li
 */
public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer> {
}
