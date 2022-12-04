package com.luyenlaptrinh.templateproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Create by
 *
 * @author : Nguyen Ba Hung
 * @since : 9/21/2022, Wed
 **/

@Getter
@Setter
@Entity
@Table(name = "TP_EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EMAIL", length = 200)
    private String email;

    @Column(name = "GENDER", nullable = false)
    private String gender;

}
