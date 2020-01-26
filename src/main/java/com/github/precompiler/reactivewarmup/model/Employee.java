package com.github.precompiler.reactivewarmup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


/**
 * @author Richard Li
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
