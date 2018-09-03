package com.lrodriguez.weather.domain;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.Resource;

@Component
public class BoardResourceAssembler implements ResourceAssembler<Board, Resource<Board>> {

    @Override
    public Resource<Board> toResource(Board entity) {
        return new Resource<Board>(entity,
            linkTo(methodOn(BoardsController.class, entity.getId()).one(entity.getId())).withSelfRel(),
            linkTo(methodOn(BoardsController.class).all()).withRel("boards"));
    }
}