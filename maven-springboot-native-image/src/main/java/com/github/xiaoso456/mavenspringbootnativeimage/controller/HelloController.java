package com.github.xiaoso456.mavenspringbootnativeimage.controller;

import com.github.xiaoso456.mavenspringbootnativeimage.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    User user;

    @RequestMapping("/hello")
    public String hello(){
        return "hello " + user;
    }
}
