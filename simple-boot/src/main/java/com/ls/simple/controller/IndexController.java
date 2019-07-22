package com.ls.simple.controller;

import com.ls.simple.service.WenDaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private WenDaService wenDaService;
    @RequestMapping("/")
    public String index(){
        return "hello world";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/my/logout")
    public String logout(){
        return "logout";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Object list(){
        return wenDaService.findAllByHboneNo("8012164853");
    }

    @RequestMapping("/admin/list")
    public Object adminList(){
        return "admin list";
    }
    @RequestMapping("/db/list")
    public Object dbList(){
        return "db list";
    }
}
