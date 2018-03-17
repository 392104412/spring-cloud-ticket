package com.link.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
public class TicketProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(TicketProviderApplication.class, args);
    }
}
