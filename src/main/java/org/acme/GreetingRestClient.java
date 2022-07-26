package org.acme;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.POST;

@RegisterRestClient
@RegisterProvider(GreetingRestClientMapper.class)
public interface GreetingRestClient {

    @POST
    void greet(GreetingDTO o);
}
