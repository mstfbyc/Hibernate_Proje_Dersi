package com.bilgeadam.entity;

import javax.persistence.*;

@Entity
@Table(name = "LOCATIONS")
public class Locations {
    @Id
    @Column(name = "LOCATION_ID")
    private Long locatıonId;

    @Column(name = "STREET_ADDRESS")
    private String streetAddress;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "CITY")
    private String cıty;

    @Column(name = "STATE_PROVINCE")
    private String stateProvince;

    @Column(name = "COUNTRY_ID", columnDefinition = "CHAR")
    private String countryId;

    public Long getLocationId() {
        return this.locatıonId;
    }

    public void setLocationId(Long locatıonId) {
        this.locatıonId = locatıonId;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return this.cıty;
    }

    public void setCity(String cıty) {
        this.cıty = cıty;
    }

    public String getStateProvince() {
        return this.stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountryId() {
        return this.countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
}
