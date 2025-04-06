package com.example.security.sso_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/")
    public String root() {
        return "home.html";
    }
}
