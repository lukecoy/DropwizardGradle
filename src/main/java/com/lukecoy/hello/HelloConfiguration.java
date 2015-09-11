package com.lukecoy.hello;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class HelloConfiguration extends Configuration {

  private final String greeting;

  @JsonCreator
  public HelloConfiguration(@JsonProperty("greeting") String greeting) {
    this.greeting = greeting;
  }

  public String getGreeting() {
    return greeting;
  }

}
