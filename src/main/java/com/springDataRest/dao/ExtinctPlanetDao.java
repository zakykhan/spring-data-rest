package com.springDataRest.dao;

import com.springDataRest.entity.ExtinctPlanet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "planets" , path = "planets")
public interface ExtinctPlanetDao extends JpaRepository<ExtinctPlanet, Integer> {
}
