package com.bilgeadam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEPARTMENTS_SQ")
    @SequenceGenerator(schema = "HR", sequenceName = "DEPARTMENTS_SEQ", allocationSize = 10, name = "DEPARTMENTS_SQ")
    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    @Column(name = "MANAGER_ID")
    private Long managerId;

    @Column(name = "LOCATION_ID")
    private Long locationId;


}
