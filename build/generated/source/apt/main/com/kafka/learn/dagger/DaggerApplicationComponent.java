package com.kafka.learn.dagger;

import com.kafka.learn.resources.Consumption;
import com.kafka.learn.resources.Consumption_Factory;
import com.kafka.learn.resources.Producer;
import com.kafka.learn.resources.Producer_Factory;
import com.kafka.learn.service.ConsumerService;
import com.kafka.learn.service.ConsumerService_Factory;
import com.kafka.learn.service.ProducerService;
import com.kafka.learn.service.ProducerService_Factory;
import dagger.internal.DoubleCheck;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<ProducerService> producerServiceProvider;

  private Provider<Producer> producerProvider;

  private Provider<ConsumerService> consumerServiceProvider;

  private Provider<Consumption> consumptionProvider;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static ApplicationComponent.Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.producerServiceProvider = DoubleCheck.provider(ProducerService_Factory.create());

    this.producerProvider = Producer_Factory.create(producerServiceProvider);

    this.consumerServiceProvider = DoubleCheck.provider(ConsumerService_Factory.create());

    this.consumptionProvider = Consumption_Factory.create(consumerServiceProvider);
  }

  @Override
  public Producer producer() {
    return new Producer(producerServiceProvider.get());
  }

  @Override
  public Consumption consumption() {
    return new Consumption(consumerServiceProvider.get());
  }

  private static final class Builder implements ApplicationComponent.Builder {
    @Override
    public ApplicationComponent build() {
      return new DaggerApplicationComponent(this);
    }

    /**
     * This module is declared, but an instance is not used in the component. This method is a
     * no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Override
    public Builder applicationModule(ApplicationModule applicationModule) {
      return this;
    }
  }
}
