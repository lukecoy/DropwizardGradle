package com.lukecoy;

import com.lukecoy.health.DatabaseHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;
import com.lukecoy.resource.HelloWorldResource;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

  public static void main(String[] args) throws Exception {
    new HelloWorldApplication().run(args);
  }

  @Override
  public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {;
    environment.jersey().register(new HelloWorldResource());
    environment.healthChecks().register("Database", new DatabaseHealthCheck());
  }

}
