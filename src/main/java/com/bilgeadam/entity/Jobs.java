package com.bilgeadam.entity;

import javax.persistence.*;

@Entity
@Table(name = "JOBS")
public class Jobs {
    @Id
    @Column(name = "JOB_ID")
    private String jobId;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @Column(name = "MIN_SALARY")
    private Long mınSalary;

    @Column(name = "MAX_SALARY")
    private Long maxSalary;

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Long getMinSalary() {
        return this.mınSalary;
    }

    public void setMinSalary(Long mınSalary) {
        this.mınSalary = mınSalary;
    }

    public Long getMaxSalary() {
        return this.maxSalary;
    }

    public void setMaxSalary(Long maxSalary) {
        this.maxSalary = maxSalary;
    }
}
