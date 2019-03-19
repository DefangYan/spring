package com.defang.api;

import com.defang.entity.Student;
import com.defang.servie.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentApi {

    @Autowired
    private StudentService studentService;

    @ApiOperation("根据姓名查询Student")
    @GetMapping(value = "api/v1/findStudentByName")
    public List<Student> findStudentByName(@PathVariable String name) { return studentService.findStudentByName(name); }
}
