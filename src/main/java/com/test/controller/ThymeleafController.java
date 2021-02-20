package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/guest")
public class ThymeleafController {

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/toUpdate/{name}")
    public String index(String name,Model model){
        model.addAttribute("name",name);
        System.out.println("这是get请求");
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String test1(String name, Model model){
        model.addAttribute("name",name);
        System.out.println("这是post请求");
        return "index";
    }

    @PutMapping
    public String test2(@PathVariable("name") String name, Model model){
        model.addAttribute("name",name);
        System.out.println("这是put请求");
        return "index";
    }

    @DeleteMapping
    public String test3(String name, Model model){
        model.addAttribute("name",name);
        System.out.println("这是delete请求");
        return "index";
    }
}
