package com.iteso.beer_catalog.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Column
    @Getter
    @Setter
    private String name;

    @Column
    @Getter
    @Setter
    private String country_city;

    @Column
    @Getter
    @Setter
    private String alcohol_percentage;

    @Column
    @Getter
    @Setter
    private String type;

    @Column
    @Getter
    @Setter
    private String brewery;

    @Column
    @Getter
    @Setter
    private String description;
}
