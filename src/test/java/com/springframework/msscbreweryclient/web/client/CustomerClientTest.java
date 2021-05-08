package com.springframework.msscbreweryclient.web.client;

import com.springframework.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerClientTest {

    @Autowired CustomerClient client;

    @Test
    void getCustomerById() {
        CustomerDto customerDto=client.getCustomerById(UUID.randomUUID());
        assertNotNull(customerDto);
    }
}