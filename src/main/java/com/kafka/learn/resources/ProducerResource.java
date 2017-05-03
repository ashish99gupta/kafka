package com.kafka.learn.resources;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.kafka.learn.service.ProducerService;

@Path("/produce")
public class ProducerResource {

    private ProducerService producerService;

    @Inject
    public ProducerResource(ProducerService service){
        this.producerService = service;
    }

    @GET
    public void produces(){
        Logger.getGlobal().info("inside producer .....................................");
        producerService.produce();
    }
}
