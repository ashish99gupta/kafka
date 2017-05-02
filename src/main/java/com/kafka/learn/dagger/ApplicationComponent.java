package com.kafka.learn.dagger;

import javax.inject.Singleton;

import com.kafka.learn.resources.Consumption;
import com.kafka.learn.resources.Producer;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

     Producer producer();
     Consumption consumption();

    @Component.Builder
    public interface Builder {
        Builder applicationModule(final ApplicationModule applicationModule);

        ApplicationComponent build();
    }
}
