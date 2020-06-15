package com.example.springboot.sb_demo01.service;

import com.example.springboot.sb_demo01.entity.Students;

import java.util.List;

public interface StudentsService {
    //查询所有学生
    List<Students> getAllStudents();
}
