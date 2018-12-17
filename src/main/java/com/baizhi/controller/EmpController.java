package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpMapper empMapper;

    @RequestMapping("getAll")
    public List<Emp> getAll() {
        return empMapper.selectAll();
    }

}
