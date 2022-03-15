package com.springDataRest.entity;

import org.springframework.data.rest.core.config.Projection;

/*
 * Projection for ExtinctPlanet Class
 */

@Projection(name = "customExtinctPlanet", types = {ExtinctPlanet.class})
public interface ExtinctPlanetProjection {

    String getGalaxy();

    int getPopulation();

}
