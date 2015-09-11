package com.lukecoy.hello.health;

import com.hubspot.dropwizard.guice.InjectableHealthCheck;

public class DatabaseHealthCheck extends InjectableHealthCheck {

  @Override
  protected Result check() {
    return Result.healthy();
  }

  @Override
  public String getName() {
    return "DatabaseHealthCheck";
  }

}
