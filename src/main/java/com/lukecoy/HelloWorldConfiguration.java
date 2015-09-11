package com.lukecoy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class HelloWorldConfiguration extends Configuration {

  private final String greeting;

  @JsonCreator
  public HelloWorldConfiguration(@JsonProperty("greeting") String greeting) {
    this.greeting = greeting;
  }

  public String getGreeting() {
    return greeting;
  }

}
