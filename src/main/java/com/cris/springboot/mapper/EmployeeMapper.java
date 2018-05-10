package com.cris.springboot.mapper;

import com.cris.springboot.bean.Employee;

// 必须使用@Mapper 或者@MapperScan
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);
}
