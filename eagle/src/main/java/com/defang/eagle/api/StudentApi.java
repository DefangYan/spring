package com.defang.eagle.api;

import com.defang.eagle.entity.Student;
import com.defang.eagle.servie.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "测试swagger服务")
@RestController
public class StudentApi {

    @Autowired
    private StudentService studentService;

    @ApiOperation("根据姓名查询Student")
    @GetMapping(value = "api/v1/findStudentByName/{name}")
    public List<Student> findStudentByName(@PathVariable String name) {
        System.out.println(name);
        return studentService.findStudentByName(name); }
}
