package com.erbing.community.community.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.model.IModel;

@Controller
public class Hello {
    @GetMapping("/hello")
    public String hello(@RequestParam(name ="name")String name ,Model model){
        model.addAttribute("name",name);
        return  "hello";
    }

}
