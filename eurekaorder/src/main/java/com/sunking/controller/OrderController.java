package com.sunking.controller;

import com.sunking.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrder")
    @ResponseBody
    public List<String> getOrder(){

        return orderService.getOrder();

    }


    @RequestMapping("/getOrderService")
    @ResponseBody
    public String getOrderService(){

        return "this is order";

    }
}
