package com.example.springboot.sb_demo01.controller;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThemeleafController {

    @RequestMapping("/hello")
    public java.lang.String hello(Model model){
        model.addAttribute("name","1231564564");
        model.addAttribute("age","18");
        return "hello";
    }
}
