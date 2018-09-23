package com.lrodriguez.weather.utils;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.Resource;

public class UriHelper {

    private static final Logger logger = LoggerFactory.getLogger(UriHelper.class);

    public static URI createUri(Resource<?> resource) {
        try {
            return new URI(resource.getId().expand().getHref());
        } catch (URISyntaxException e) {
            logger.warn("There was an error while trying to create a resource URI.");
            logger.error("Failed URI creation.", e);
            throw new RuntimeException("Failed URI creation", e);
		}
    }
}