package com.lukecoy.hello.service;

import com.google.inject.Inject;
import com.lukecoy.hello.data.NameDao;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HelloResource {

  private final NameDao nameDao;

  @Inject
  public HelloResource(NameDao nameDao) {
    this.nameDao = nameDao;
  }

  @GET
  public Response ok() {
    return Response.ok().build();
  }

}
