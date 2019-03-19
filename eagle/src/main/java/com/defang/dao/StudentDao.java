package com.defang.dao;

import com.defang.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student, Long> {

    List<Student> findAllByName(String name);

    //项目中遇到的情况是  update主键的时候会报冲突org.springframework.orm.jpa.JpaSystemException: identifier of an instance of com.××.××.entity.×× was altered
    //采取解决方案， 在save之前  进行BeanMapper转化一下对象
}
