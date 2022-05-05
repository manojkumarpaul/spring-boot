package com.spring.boot.secondrestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @RequestMapping("/")
    public String getAcknowledgement(){
        return "Money received acknowledged";
    }
}
