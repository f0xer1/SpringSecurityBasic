package com.ezybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/getAccountDetails")
    public String getAccountDetalis(){
        return "Here are the account details from the DB";
    }

}
