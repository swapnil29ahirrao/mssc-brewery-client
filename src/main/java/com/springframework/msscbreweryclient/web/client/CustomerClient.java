package com.springframework.msscbreweryclient.web.client;

import com.springframework.msscbreweryclient.web.model.CustomerDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
public class CustomerClient {

    public final String CUSTOMER_PATH_V1="/api/v1/customer/";
    private String apihost;

    private RestTemplate client;

    public CustomerClient(RestTemplateBuilder restTemplateBuilder) {
        this.client = restTemplateBuilder.build();
    }

    public void setApihost(String apihost) {
        this.apihost = apihost;
    }

    public CustomerDto getCustomerById(UUID customerId){
        return client.getForObject(apihost+CUSTOMER_PATH_V1+customerId.toString(),CustomerDto.class);
    }
}
