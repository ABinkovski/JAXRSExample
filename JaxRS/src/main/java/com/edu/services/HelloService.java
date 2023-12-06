package com.edu.services;

import com.edu.domain.LocalTimeDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.time.OffsetDateTime;

@Path("/")
public class HelloService {

    @GET
    @Path("/xml")
    @Produces("text/xml")
    public Response getXml() {
        return Response.ok(LocalTimeDto.createInstance()).build();
    }

    @GET
    @Path("/")
    @Produces("application/json")
    public Response getJson() {
        return Response.ok(OffsetDateTime.now()).build();
    }
}
