package com.example.springboot.sb_demo01.controller;

import com.example.springboot.sb_demo01.entity.Students;
import com.example.springboot.sb_demo01.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @RequestMapping("/showStudents")
    public String showStudents(Model model){
        //调用业务
        List<Students> list = this.studentsService.getAllStudents();
        //填充数据
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("/getAllStudents")
    @ResponseBody
  //@CrossOrigin(value = "*")  //解决跨域问题
    public List<Students> getAllStudents(){
        List<Students> list = this.studentsService.getAllStudents();
        return list;
    }
}
