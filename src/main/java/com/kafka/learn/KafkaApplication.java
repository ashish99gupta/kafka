package com.kafka.learn;

import com.kafka.learn.dagger.ApplicationComponent;
import com.kafka.learn.dagger.ApplicationModule;
import com.kafka.learn.dagger.DaggerApplicationComponent;
import com.kafka.learn.resources.Consumption;
import com.kafka.learn.resources.Producer;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class KafkaApplication extends Application<KafkaConfiguration> {
    public static void main(String[] args) throws Exception {
        new KafkaApplication().run(args);
    }

    private ApplicationComponent getApplicationComponent(KafkaConfiguration configuration){
        return DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(configuration))
                .build();
    }

    @Override
    public void run(KafkaConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(Consumption.class);
        environment.jersey().register(Producer.class);
    }

}
