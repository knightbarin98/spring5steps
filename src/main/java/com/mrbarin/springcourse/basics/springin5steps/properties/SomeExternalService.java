package com.mrbarin.springcourse.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    //from poperty file
    //value to read the value from the properties file
    @Value("${external.service.url}")
    private String url;

    public String returnServiceUrl() {
        return url;
    }
}
