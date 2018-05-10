package com.cris.springboot.controller;

import com.cris.springboot.bean.Department;
import com.cris.springboot.bean.Employee;
import com.cris.springboot.mapper.DepartmentMapper;
import com.cris.springboot.mapper.EmployeeMapper;
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

    @Autowired
    public EmployeeMapper employeeMapper;

    @GetMapping("/dept")
    public Department saveDept(Department department){
        departmentMapper.saveDept(department);
        return department;
    }

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        Department dept = departmentMapper.getDeptById(id);
        return dept;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id) {
        Employee emp = employeeMapper.getEmpById(id);
        return emp;
    }


}
