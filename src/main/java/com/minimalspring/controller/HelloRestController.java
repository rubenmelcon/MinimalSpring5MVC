package com.minimalspring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping(value = "/greetingRest")
    public String[] sayHello(Model model) {

        model.addAttribute("greeting", "Hello World");

        return new String[] {"hello", "world"};
    }
}
