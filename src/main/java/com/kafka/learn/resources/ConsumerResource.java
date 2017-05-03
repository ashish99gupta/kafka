package com.kafka.learn.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.kafka.learn.service.ConsumerService;

@Path("/consume")
public class ConsumerResource {

    private ConsumerService consumerService;

    @Inject
    public ConsumerResource(ConsumerService service){
        this.consumerService = service;
    }

    @GET
    public void get(){
        consumerService.consume();
    }

}
