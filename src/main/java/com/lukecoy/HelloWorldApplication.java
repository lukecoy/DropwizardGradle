package com.lukecoy;

import com.lukecoy.health.DatabaseHealthCheck;
import com.lukecoy.resource.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

  public static void main(String[] args) throws Exception {
    new HelloWorldApplication().run(args);
  }

  @Override
  public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {
    environment.jersey().register(new HelloWorldResource());
    environment.healthChecks().register("Database", new DatabaseHealthCheck());
  }

}
