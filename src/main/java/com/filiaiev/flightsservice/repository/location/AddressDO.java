package com.filiaiev.flightsservice.repository.location;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity(name = "address")
@Data
public class AddressDO {

    @Id
    private Integer id;

    @OneToOne
    private CityDO city;

    private String address;

    private String postcode;
}
