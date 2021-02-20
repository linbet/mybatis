package com.test.controller;

import com.test.controller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyBatisController {


    @Autowired
    private UserService  service;

    @RequestMapping("/user")
    @ResponseBody
    public String mybatisUser(){

        System.out.println(service.list());
        return "mybatis";
    }
}
