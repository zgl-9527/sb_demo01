package com.example.springboot.sb_demo01;

import com.example.springboot.sb_demo01.entity.Students;
import com.example.springboot.sb_demo01.entity.StudentsExample;
import com.example.springboot.sb_demo01.mapper.StudentsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)  //以spring的方式运行
@SpringBootTest   //springboot工程测试  自动从启动类运行
public class SbDemo01ApplicationTests {

    //注入相应的测试dao层组件  业务组件
    @Autowired(required = false)
    private StudentsMapper studentsMapper;

    //一个方法一个测试用例
    @Test
    public void contextLoads() {
        List<Students> list = this.studentsMapper.selectByExample(new StudentsExample());
        System.out.println("总共查询到多少行："+list.size());
    }

}
