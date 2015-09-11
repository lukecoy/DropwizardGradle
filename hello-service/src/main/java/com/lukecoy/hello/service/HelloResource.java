package com.lukecoy.hello.service;

import com.google.inject.Inject;
import com.lukecoy.hello.data.NameDao;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.Instant;
import java.util.List;

@Path("/hello")
public class HelloResource {

  private final NameDao nameDao;

  @Inject
  public HelloResource(NameDao nameDao) {
    this.nameDao = nameDao;
  }

  @GET
  @Path("/name-range")
  @Produces(MediaType.APPLICATION_JSON)
  public List<String> getNameRange(@QueryParam("from") int from,
                                   @QueryParam("to") int to) {
    return nameDao.findNamesBetween(from, to);
  }

  @PUT
  public Response putName(@QueryParam("name") String name) {
    nameDao.insert(name, Instant.now().getEpochSecond());
    return Response.ok(String.format("Hello, %s!", name)).build();
  }

}
