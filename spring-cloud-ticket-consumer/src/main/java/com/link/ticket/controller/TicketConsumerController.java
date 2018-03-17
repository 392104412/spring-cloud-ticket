package com.link.ticket.controller;

import com.link.ticket.service.BuyTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TicketConsumerController {

    @Autowired
    private BuyTicketService buyTicketService;

    @RequestMapping(value = "/buy", method = RequestMethod.GET)
    public String buyTicket(){
        return buyTicketService.buyTicket();
    }
}
