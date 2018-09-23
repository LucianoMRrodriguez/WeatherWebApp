package com.lrodriguez.weather.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class SubscriptionService {

    // @Autowired
    // private BoardRepository boardRepository;

    // @Autowired
    // private LocationRepository locationRepository;

    // public Mono<?> handle(Location where, String boardId) {
    //     if(locationExists)
    //         return doOnExist(locationId, boardId);
    //     else
    //         return doOnNotExist(locationId, boardId);
    // }

    // private Mono<?> doOnExist(String locationCode, String boardId) {
    //     return Mono.empty();
    //     // return
    //     //     boardRepository.findById(boardId)
    //     //                    .doOnSuccess(e -> {
    //     //                         locationRepository.findByCode(locationCode)
    //     //                                           .doOnSuccess( l -> e.addSubscription(l,l.getCode()));
    //     //                 })
    //     //                    .map(boardRepository::save);
        
    // }

    // private Mono<?> doOnNotExist(String locationId, String boardId) {
    //     return Mono.empty();
    // }
}