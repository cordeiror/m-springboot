package com.cords.springboot.demo.controllers;

import cords.springframework.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by renato on {2019-12-16}
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public Map<String, Object> getIndex(){

        Map<String, Object> returnVal = new HashMap<>();

        returnVal.put("hello", "world");

        return returnVal;

    }

    @RequestMapping("/address")
    public ShippingAddress getAddress(){

        ShippingAddress shippingAddress = new ShippingAddress();

        shippingAddress.setCountryName("Canada");
        shippingAddress.setLocality("Quebec");

        return shippingAddress;
    }

}
