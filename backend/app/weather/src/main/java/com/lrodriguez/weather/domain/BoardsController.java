package com.lrodriguez.weather.domain;

import java.util.Map;

import com.lrodriguez.weather.utils.UriHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/boards")
public class BoardsController {

    @Autowired
    private BoardRepository repository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private BoardResourceAssembler assembler;

    @Autowired
    private SubscriptionService subsService;
    @PostMapping
    public Mono<?> newBoard(@RequestBody Board b) {
        return 
            repository.save(b)
                      .map(assembler::toResource)
                      .map(i -> ResponseEntity.created(UriHelper.createUri(i))
                                              .body(i));
    }

    @GetMapping(path = "/{id}")
    public Mono<?> one(@PathVariable String id) {
        return
            repository.findById(id)
                      .map(assembler::toResource)
                      .map(ResponseEntity::ok);
    }

    @GetMapping
    public Flux<?> all() {
        return 
            repository.findAll()
                      .map(assembler::toResource)
                      .map(ResponseEntity::ok);
    }

    @PutMapping(path="/{id}/locations")
    public Mono<?> subscribe(@RequestBody Map<String,String> req, @PathVariable String id) { 
        Mono<Location> monoLocation = Mono.just(req.get("locationCode"))
                                          .flatMap(locationRepository::findByCode)
                                          .switchIfEmpty(Mono.just(new Location()));

        Mono<Board> monoBoard = repository.findById(id);
        
        return 
            Mono.zip(monoBoard,monoLocation)
                .map( t -> t.getT1()
                            .addSubscription(Mono.just(t.getT2())))
                .flatMap(repository::save)
                .map(assembler::toResource)
                .map(ResponseEntity::ok);
    }
}