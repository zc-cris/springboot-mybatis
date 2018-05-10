package com.cris.springboot.mapper;

import com.cris.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @ClassName DepartmentMapper
 * @Description 通过注解的方式创建一个mapper接口
 * @Author zc-cris
 * @Version 1.0
 **/
//@Mapper
public interface DepartmentMapper {

    // 插入数据完成后，将自增长的id值又放入当前department 对象中
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department (department_name) values (#{departmentName})")
    public Integer saveDept(Department department);

    @Delete("delete from department where id = #{id}")
    public int removeDept(Integer id);

    @Update("update department set department_name = #{departmentName} where id = #{id}")
    public int updateDept(Department department);

    @Select("select id, department_name from department where id = #{id}")
    public Department getDept(Integer id);





}
