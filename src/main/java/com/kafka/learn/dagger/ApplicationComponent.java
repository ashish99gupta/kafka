package com.kafka.learn.dagger;

import javax.inject.Singleton;

import com.kafka.learn.resources.ConsumerResource;
import com.kafka.learn.resources.ProducerResource;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

     ProducerResource producer();
     ConsumerResource consumption();

    @Component.Builder
    public interface Builder {
        Builder applicationModule(final ApplicationModule applicationModule);

        ApplicationComponent build();
    }
}
