package com.bilgeadam.dto;

import lombok.*;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString
public class EmployeesDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Timestamp hireDate;
    private Double salary;
    private Double commissionPct;
    private DepartmentsDTO departments;
}
