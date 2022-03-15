package com.springDataRest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "extinct_planets")
@Getter
@Setter
public class ExtinctPlanet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "alien_id")
    private int alienId;

    private String name;

    private String galaxy;

    private long population;

}
