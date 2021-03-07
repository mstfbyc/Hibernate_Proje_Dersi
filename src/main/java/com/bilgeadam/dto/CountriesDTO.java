package com.bilgeadam.dto;

public class CountriesDTO {
    private String countryId;
    private String countryName;
    private Long regıonId;

    public String getCountryId() {
        return this.countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Long getRegionId() {
        return this.regıonId;
    }

    public void setRegionId(Long regıonId) {
        this.regıonId = regıonId;
    }
}
