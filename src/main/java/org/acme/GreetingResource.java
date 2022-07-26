package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @RestClient
    GreetingRestClient restClient;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        GreetingDTO dto = new GreetingDTO();
        dto.setGreeting("hellooooo");
        restClient.greet(dto);
        return "Hello from RESTEasy Reactive";
    }
}