package com.lukecoy.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldResource {

  @GET
  public Response ok() {
    return Response.ok().build();
  }

}
