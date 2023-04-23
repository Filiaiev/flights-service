package com.filiaiev.flightsservice.repository.location;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "zones")
@Data
public class ZoneDO {

    @Id
    private Integer id;

    private String name;
}
