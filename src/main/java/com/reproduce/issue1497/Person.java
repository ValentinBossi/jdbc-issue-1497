package com.reproduce.issue1497;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table
public class Person {
    @Id
    private Long id;
    private String name;
    private Integer age;
}