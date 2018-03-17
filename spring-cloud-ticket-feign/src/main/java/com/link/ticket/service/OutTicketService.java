package com.link.ticket.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("out-ticket")
public interface OutTicketService {
    @RequestMapping("outTicket")
    String outTicket();
}
