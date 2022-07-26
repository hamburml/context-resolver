package org.acme;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

@Provider
public class GreetingRestClientMapper implements ContextResolver<ObjectMapper> {

    private ObjectMapper mapper;

    public GreetingRestClientMapper() {
        mapper = new ObjectMapper();
        // additional stuff like register JavaTimeModule() add MixIn, ...
    }

    @Override
    public ObjectMapper getContext(Class<?> aClass) {
        // this runs when GreetingRestClient.greet() is called
        return mapper;
    }
}
