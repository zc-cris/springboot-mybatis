package com.cris.springboot.controller;

import com.cris.springboot.bean.Department;
import com.cris.springboot.mapper.DepartmentMapper;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DeptController
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
@RestController
public class DeptController {

    @Autowired
    public DepartmentMapper departmentMapper;

    @GetMapping("/dept")
    public Department saveDept(Department department){
        departmentMapper.saveDept(department);
        return department;
    }

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        Department dept = departmentMapper.getDept(id);
        return dept;
    }


}
