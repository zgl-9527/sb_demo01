package com.example.springboot.sb_demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/goIndex")
    public String goIndex(){
        return "index";
    }
}
