package com.kafka.learn.resources;

import com.kafka.learn.service.ConsumerService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Consumption_Factory implements Factory<Consumption> {
  private final Provider<ConsumerService> serviceProvider;

  public Consumption_Factory(Provider<ConsumerService> serviceProvider) {
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public Consumption get() {
    return new Consumption(serviceProvider.get());
  }

  public static Factory<Consumption> create(Provider<ConsumerService> serviceProvider) {
    return new Consumption_Factory(serviceProvider);
  }
}
