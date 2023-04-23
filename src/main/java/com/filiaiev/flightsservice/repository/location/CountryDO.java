package com.filiaiev.flightsservice.repository.location;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity(name = "countries")
@Data
public class CountryDO {

    @Id
    private Integer id;

    @OneToOne
    private ZoneDO zone;

    private String name;
}
