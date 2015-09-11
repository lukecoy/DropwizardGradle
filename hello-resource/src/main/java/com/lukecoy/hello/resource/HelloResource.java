package com.lukecoy.hello.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {

  @GET
  public Response ok() {
    return Response.ok().build();
  }

}
