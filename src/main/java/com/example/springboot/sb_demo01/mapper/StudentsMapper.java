package com.example.springboot.sb_demo01.mapper;

import com.example.springboot.sb_demo01.entity.Students;
import com.example.springboot.sb_demo01.entity.StudentsExample;
import java.util.List;

public interface StudentsMapper {
    int deleteByPrimaryKey(Integer xh);

    int insert(Students record);

    int insertSelective(Students record);

    List<Students> selectByExample(StudentsExample example);

    Students selectByPrimaryKey(Integer xh);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}