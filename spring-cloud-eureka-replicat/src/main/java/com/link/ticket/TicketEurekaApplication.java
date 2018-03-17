package com.link.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TicketEurekaApplication {

    public static void main(String[] args){
        SpringApplication.run(TicketEurekaApplication.class,args);
    }
}
