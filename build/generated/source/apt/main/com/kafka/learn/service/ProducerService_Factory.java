package com.kafka.learn.service;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProducerService_Factory implements Factory<ProducerService> {
  private static final ProducerService_Factory INSTANCE = new ProducerService_Factory();

  @Override
  public ProducerService get() {
    return new ProducerService();
  }

  public static Factory<ProducerService> create() {
    return INSTANCE;
  }

  /** Proxies {@link ProducerService#ProducerService()}. */
  public static ProducerService newProducerService() {
    return new ProducerService();
  }
}
