package com.iteso.beer_catalog.controllers;

import com.iteso.beer_catalog.models.Beer;
import com.iteso.beer_catalog.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BeerController {

    @Autowired
    private Repository repo;

    @GetMapping()
    public String helloWorld() {
        return "API is running";
    }

    @GetMapping("beers")
    public List<Beer> getBeers() {
        return repo.findAll();
    }

    @PostMapping("beers")
    public Beer postBeer(@RequestBody Beer beer) {
        return repo.save(beer);
    }

    @PutMapping("beers/{id}")
    public Beer putBeer(@PathVariable Long id, @RequestBody Beer beer) {
        beer.setId(id);
        return repo.save(beer);
    }

    @DeleteMapping("beers/{id}")
    public String deleteBeer(@PathVariable Long id) {
        repo.deleteById(id);
        return "Beer deleted";
    }
}
