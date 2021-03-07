package com.bilgeadam.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(schema = "HR", name = "EMPLOYEES")
@Data
@ToString
public class Employees {
    @Id
    @Column(name = "EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_SQE")
    @SequenceGenerator(schema = "HR", sequenceName = "EMPLOYEES_SEQ", allocationSize = 1, name = "EMPLOYEE_SQE")
    private Long employeeId;

    @Column(name = "FIRST_NAME", length = 20)
    private String firstName;

    @Column(name = "LAST_NAME", length = 25)
    private String lastName;

    @Column(name = "EMAIL", length = 25)
    private String email;

    @Column(name = "PHONE_NUMBER", length = 20)
    private String phoneNumber;

    @Column(name = "HIRE_DATE")
    private Timestamp hireDate;

    @Column(name = "JOB_ID", length = 10)
    private String jobId;

    @Column(name = "SALARY")
    private Double salary;

    @Column(name = "COMMISSION_PCT")
    private Double commissionPct;

    @Column(name = "MANAGER_ID")
    private Long managerId;

    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    /*
    OneToOne
    oneToMany
    ManyToOne
    LAZY = join edilen tablo kullanıdığında çalışır
    EAGER = tablo her çağrıldığında join ilişkisini kurar.
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID", foreignKey = @ForeignKey(name = "DEPARTMENT_ID"), insertable = false, updatable = false)
    private Departments departments;

}
