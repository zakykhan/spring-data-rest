package com.springDataRest.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

/*
* Projection for Alien Class
*/

@Projection(name = "customAlien", types = {Alien.class, ExtinctPlanet.class})
public interface AlienProjection {

    String getRace();

    @Value("#{target.race}-#{target.planet}")
    String getRacePlanet();

    List<ExtinctPlanet> getExtinctPlanets();

    @Value("#{target.getExtinctPlanets().size()}")
    int getExtinctPlanetCount();

}
