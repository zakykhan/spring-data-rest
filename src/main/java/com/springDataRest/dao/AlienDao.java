package com.springDataRest.dao;

import com.springDataRest.entity.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "aliens" , path = "aliens")
public interface AlienDao extends JpaRepository<Alien, Integer> {

    @RestResource(rel = "/by-raceAndPlanet")
    public Optional<Alien> findByRaceAndPlanet(String race, String planet);

}
