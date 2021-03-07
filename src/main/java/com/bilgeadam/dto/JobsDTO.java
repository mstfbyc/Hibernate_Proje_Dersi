package com.bilgeadam.dto;

public class JobsDTO {
    private String jobId;
    private String jobTitle;
    private Long mınSalary;
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
