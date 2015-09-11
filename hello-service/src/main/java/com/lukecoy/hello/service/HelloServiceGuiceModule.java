package com.lukecoy.hello.service;

import com.google.inject.AbstractModule;
import com.lukecoy.hello.data.HelloDataGuiceModule;

public class HelloServiceGuiceModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new HelloDataGuiceModule());
  }

}
