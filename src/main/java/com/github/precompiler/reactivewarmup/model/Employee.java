package com.github.precompiler.reactivewarmup.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Richard Li
 */

@Data
@AllArgsConstructor
public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
