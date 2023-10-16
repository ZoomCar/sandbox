package com.zoomcar.resources;
import com.codahale.metrics.annotation.Timed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;
import java.util.Map;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    public HelloWorldResource() {}

    @GET
    @Timed
    public Response greetings(@QueryParam("name") String name) {
        Map<String, String> map = new HashMap<>();
        map.put("greetings", "Keep Zooming " + name);
        return Response.ok(map).build();
    }
}
