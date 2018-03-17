package com.link.ticket.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("buy-ticket")
public interface BuyTicketService {

    @RequestMapping("/buyTicket")
    String buyTicket();
}
