/* Copyright 2016 Yatra.com */
package com.kafka.learn.dagger;

import javax.inject.Inject;

import com.kafka.learn.KafkaConfiguration;

import dagger.Module;


@Module
public class ApplicationModule {
  private final KafkaConfiguration serviceConfiguration;

  @Inject
  public ApplicationModule(final KafkaConfiguration serviceConfiguration) {
    this.serviceConfiguration = serviceConfiguration;
  }
}
