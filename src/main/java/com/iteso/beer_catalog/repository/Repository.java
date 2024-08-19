package com.iteso.beer_catalog.repository;

import com.iteso.beer_catalog.models.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Beer, Long> {
}
