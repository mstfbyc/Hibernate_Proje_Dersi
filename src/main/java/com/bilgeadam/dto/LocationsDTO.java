package com.bilgeadam.dto;

public class LocationsDTO {
    private Long locatıonId;
    private String streetAddress;
    private String postalCode;
    private String cıty;
    private String stateProvince;
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
