package com.lukecoy.hello;

import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloApplication extends Application<HelloConfiguration> {

  private GuiceBundle<HelloConfiguration> guiceBundle;

  public static void main(String[] args) throws Exception {
    new HelloApplication().run(args);
  }

  @Override
  public void initialize(Bootstrap<HelloConfiguration> bootstrap) {
    guiceBundle = GuiceBundle.<HelloConfiguration>newBuilder()
        .addModule(new HelloGuiceModule())
        .enableAutoConfig(getClass().getPackage().getName())
        .setConfigClass(HelloConfiguration.class)
        .build();

    bootstrap.addBundle(guiceBundle);
  }

  @Override
  public void run(HelloConfiguration configuration, Environment environment) throws Exception {
  }

}
