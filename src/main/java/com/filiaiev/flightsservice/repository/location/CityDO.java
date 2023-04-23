package com.filiaiev.flightsservice.repository.location;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity(name = "cities")
@Data
public class CityDO {

    @Id
    private Integer id;

    @OneToOne
    private CountryDO country;

    private String name;
}
