package com.lrodriguez.weather.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class BoardService {

    @Autowired
    private BoardRepository repository;

}