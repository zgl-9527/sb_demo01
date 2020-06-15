package com.example.springboot.sb_demo01.service.impl;

import com.example.springboot.sb_demo01.entity.Students;
import com.example.springboot.sb_demo01.entity.StudentsExample;
import com.example.springboot.sb_demo01.mapper.StudentsMapper;
import com.example.springboot.sb_demo01.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired(required = false)
    private StudentsMapper studentsMapper;

    @Override
    public List<Students> getAllStudents() {
        return this.studentsMapper.selectByExample(new StudentsExample());
    }
}
