package com.kafka.learn.resources;

import com.kafka.learn.service.ProducerService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Producer_Factory implements Factory<Producer> {
  private final Provider<ProducerService> serviceProvider;

  public Producer_Factory(Provider<ProducerService> serviceProvider) {
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public Producer get() {
    return new Producer(serviceProvider.get());
  }

  public static Factory<Producer> create(Provider<ProducerService> serviceProvider) {
    return new Producer_Factory(serviceProvider);
  }
}
