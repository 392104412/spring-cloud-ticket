package com.link.ticket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyTicketController {


    @RequestMapping(value = "/buyTicket", method = RequestMethod.GET)
    public String buyTicket(){
        return "you buy some ticket";
    }
}
