package com.bilgeadam.entity;

import javax.persistence.*;

@Entity
@Table(name = "JOB_HISTORY")
public class JobHistory {
    @Id
    @Column(name = "EMPLOYEE_ID")
    private Long employeeId;

    @Id
    @Column(name = "START_DATE")
    private java.sql.Date startDate;

    @Column(name = "END_DATE")
    private java.sql.Date endDate;

    @Column(name = "JOB_ID")
    private String jobId;

    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public java.sql.Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(java.sql.Date startDate) {
        this.startDate = startDate;
    }

    public java.sql.Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(java.sql.Date endDate) {
        this.endDate = endDate;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}
