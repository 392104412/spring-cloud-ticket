package com.link.ticket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class OutTicketController {


    /**
     * 测试hystrix 熔断性
     * @return
     */
    @RequestMapping(value = "/outTicket", method = RequestMethod.GET)
    public String buyTicket(){

        Random random = new Random();
        long time = random.nextInt(3000);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "you buy one ticket";
    }
}
