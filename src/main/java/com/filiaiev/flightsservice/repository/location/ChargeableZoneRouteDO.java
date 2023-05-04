package com.filiaiev.flightsservice.repository.location;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "chargeable_zone_routes")
@Data
public class ChargeableZoneRouteDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private ZoneDO originZone;

    @OneToOne
    private ZoneDO destinationZone;
}
