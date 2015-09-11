package com.lukecoy.hello.data;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.lukecoy.hello.config.HelloGuiceModule;
import org.skife.jdbi.v2.DBI;

public class HelloDataGuiceModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new HelloGuiceModule());
  }

  @Provides
  public NameDao providesNameDao(DBI jdbi) {
    return jdbi.onDemand(NameDao.class);
  }

}
