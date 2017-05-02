package com.kafka.learn.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.kafka.learn.service.ConsumerService;

@Path("/consume")
public class Consumption {

    private ConsumerService producerService;

    @Inject
    public Consumption(ConsumerService service){
        this.producerService = service;
    }

    @GET
    public void get(){
        producerService.consume();
    }

}
