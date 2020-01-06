package com.leslie.service.feign.controller;

import com.leslie.service.feign.service.SchedulServiceHi;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private SchedulServiceHi schedulServiceHi;


    @GetMapping("/")
    public String index(){
        return schedulServiceHi.sayHiFromClientOne();
    }
    @GetMapping("/hi")
    public String hello(@RequestParam(required = false) String name){
        return schedulServiceHi.sayHiFromClientTwo(name);
    }
}
