package com.lrodriguez.weather.domain;

import com.lrodriguez.weather.utils.UriHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin
@RestController
@RequestMapping("/api/locations")
public class LocationsController {

    @Autowired
    private LocationRepository repository;

    @Autowired
    private LocationResourceAssembler assembler;

    @PostMapping
    public Mono<?> newLocation(@RequestBody Location l) {
        return
            repository.save(l)
                      .map(assembler::toResource)
                      .map(i -> ResponseEntity.created(UriHelper.createUri(i))
                                              .body(i));
    }

    @GetMapping
    public Flux<?> all() {
        return
            repository.findAll()
                      .map(assembler::toResource)
                      .map(ResponseEntity::ok);
    }
    
    @GetMapping(path= "/{id}")
    public Mono<?> one(@PathVariable String id) {
        return 
            repository.findById(id)
                      .map(assembler::toResource)
                      .map(ResponseEntity::ok);
    }
}