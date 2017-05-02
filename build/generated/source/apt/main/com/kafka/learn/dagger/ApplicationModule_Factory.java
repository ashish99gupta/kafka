package com.kafka.learn.dagger;

import com.kafka.learn.KafkaConfiguration;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_Factory implements Factory<ApplicationModule> {
  private final Provider<KafkaConfiguration> serviceConfigurationProvider;

  public ApplicationModule_Factory(Provider<KafkaConfiguration> serviceConfigurationProvider) {
    assert serviceConfigurationProvider != null;
    this.serviceConfigurationProvider = serviceConfigurationProvider;
  }

  @Override
  public ApplicationModule get() {
    return new ApplicationModule(serviceConfigurationProvider.get());
  }

  public static Factory<ApplicationModule> create(
      Provider<KafkaConfiguration> serviceConfigurationProvider) {
    return new ApplicationModule_Factory(serviceConfigurationProvider);
  }
}
