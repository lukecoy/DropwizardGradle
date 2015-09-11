package com.lukecoy.hello.config;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class HelloGuiceModule extends AbstractModule {

  @Override
  protected void configure() {
  }

  @Provides
  public DBI providesDBI(HelloConfiguration configuration, Environment environment) {
    return new DBIFactory().build(environment, configuration.getDataSourceFactory(), "sqlite");
  }

}
