package com.lrodriguez.weather.domain;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
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
    private BoardResourceAssembler assembler;

    @PostMapping
    public Mono<?> newBoard(@RequestBody Board b) throws URISyntaxException{
        return repository.save(b)
            .map(assembler::toResource)
            .map( i -> {
                    try {
                        return ResponseEntity.created(new URI(i.getId().expand().getHref())).body(i);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        return Mono.empty();
                    }
                });
    }

    @GetMapping(path="/{id}")
    public Mono<?> one(@PathVariable String id) {
        return repository.findById(id)
            .map(assembler::toResource)
            .map(ResponseEntity::ok);
    }

    @GetMapping
    public Flux<?> all() {
        return repository.findAll()
            .map(assembler::toResource)
            .map(ResponseEntity::ok);
    }
}