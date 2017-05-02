package com.kafka.learn.service;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConsumerService_Factory implements Factory<ConsumerService> {
  private static final ConsumerService_Factory INSTANCE = new ConsumerService_Factory();

  @Override
  public ConsumerService get() {
    return new ConsumerService();
  }

  public static Factory<ConsumerService> create() {
    return INSTANCE;
  }

  /** Proxies {@link ConsumerService#ConsumerService()}. */
  public static ConsumerService newConsumerService() {
    return new ConsumerService();
  }
}
