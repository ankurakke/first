package com.gangster.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    
    @GetMapping(path = "/")
    public String showInitial() {
        return "Hello Mumbai";
    }

}
