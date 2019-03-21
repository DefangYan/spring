package com.defang.eagle.servie;

import com.defang.eagle.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findStudentByName(String name);

}
