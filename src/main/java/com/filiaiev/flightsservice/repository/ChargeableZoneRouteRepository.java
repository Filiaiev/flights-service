package com.filiaiev.flightsservice.repository;

import com.filiaiev.flightsservice.repository.location.ChargeableZoneRouteDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ChargeableZoneRouteRepository extends JpaRepository<ChargeableZoneRouteDO, Integer> {

    @Query("SELECT czr FROM chargeable_zone_routes czr " +
            "JOIN airports a1 ON a1.id = ?1 " +
            "JOIN airports a2 ON a2.id = ?2 " +
            "WHERE a1.zone = czr.originZone AND a2.zone = czr.destinationZone"
    )
    ChargeableZoneRouteDO findChargeableZoneRouteByAirportIds(Integer originAirportId, Integer destinationAirportId);
}
