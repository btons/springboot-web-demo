package com.k8s.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name) {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "Hello "+name+"! I'm springboot-web-demo controller! time:"+df.format(new Date());
    }
    
    @RequestMapping("/hello2")
    public String sayHello() {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "Hello Bro! I'm springboot-web-demo controller! time:"+df.format(new Date());
    }
    
}
