package com.example.springboot.sb_demo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//1.启动类会自动扫描当前包下，及其子包下所有的spring注解配置
//2.使用ComponentScan注解指定描述注解所在包
//@ComponentScan(value = "com.example.controller")
//添加扫描mybatis的dao层接口，生成实现类
@MapperScan(basePackages = "com.example.springboot.sb_demo01.mapper")
@ServletComponentScan(basePackages = {"com.example.springboot.sb_demo01.filter"})
public class SbDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(SbDemo01Application.class, args);
    }

}
