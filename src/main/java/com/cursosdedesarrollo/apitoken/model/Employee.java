package com.cursosdedesarrollo.apitoken.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author JavaSolutionsGuide
 *
 */
@Data
@Entity
@Table(name="EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="EMPLOYEE_NAME")
    private String name;

    @Column(name="EMPLOYEE_SALARY")
    private Integer salary;

    @Column(name="DEPARTMENT")
    private String department;


}

