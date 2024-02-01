package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HelloWorldController {

  @GetMapping(value = "/hello")
  public String sayHello(@RequestParam String fullName) {
    return "Hello " + fullName + " and welcome to my app";
  }
}
