package com.filiaiev.flightsservice.repository.flight;

import com.filiaiev.flightsservice.repository.location.AddressDO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity(name = "airports")
@Data
public class AirportDO {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private AddressDO address;

    private String iataCode;
}
