package com.bilgeadam.entity;

import javax.persistence.*;

@Entity
@Table(name = "REGIONS")
public class Regions {
    @Id
    @Column(name = "REGION_ID")
    private Long regıonId;

    @Column(name = "REGION_NAME")
    private String regıonName;

    public Long getRegionId() {
        return this.regıonId;
    }

    public void setRegionId(Long regıonId) {
        this.regıonId = regıonId;
    }

    public String getRegionName() {
        return this.regıonName;
    }

    public void setRegionName(String regıonName) {
        this.regıonName = regıonName;
    }
}
