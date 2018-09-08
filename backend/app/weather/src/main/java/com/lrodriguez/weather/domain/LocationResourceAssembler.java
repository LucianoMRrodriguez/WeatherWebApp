package com.lrodriguez.weather.domain;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

@Component
public class LocationResourceAssembler implements ResourceAssembler<Location, Resource<Location>> {

    @Override
    public Resource<Location> toResource(Location entity) {
        return 
            new Resource<Location>(entity,
                linkTo(
                    methodOn(LocationsController.class, entity.getId())
                        .one(entity.getId()))
                        .withSelfRel());
    }
}