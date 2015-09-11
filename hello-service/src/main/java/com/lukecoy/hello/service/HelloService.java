package com.lukecoy.hello.service;

import com.hubspot.dropwizard.guice.GuiceBundle;
import com.lukecoy.hello.config.HelloGuiceModule;
import com.lukecoy.hello.config.HelloConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloService extends Application<HelloConfiguration> {

  private static final String AUTO_CONFIG_PACKAGE = "com.lukecoy.hello";

  public static void main(String[] args) throws Exception {
    new HelloService().run(args);
  }

  @Override
  public void initialize(Bootstrap<HelloConfiguration> bootstrap) {
    GuiceBundle<HelloConfiguration> guiceBundle = GuiceBundle.<HelloConfiguration>newBuilder()
        .addModule(new HelloGuiceModule())
        .enableAutoConfig(AUTO_CONFIG_PACKAGE)
        .setConfigClass(HelloConfiguration.class)
        .build();

    bootstrap.addBundle(guiceBundle);
  }

  @Override
  public void run(HelloConfiguration configuration, Environment environment) throws Exception {
  }

}
