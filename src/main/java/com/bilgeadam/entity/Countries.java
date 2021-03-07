package com.bilgeadam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRIES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Countries {
    @Id
    @Column(name = "COUNTRY_ID", columnDefinition = "CHAR", length = 2)
    private String countryId;

    @Column(name = "COUNTRY_NAME", length = 40)
    private String countryName;

    @Column(name = "REGION_ID")
    private Long regıonId;

}
