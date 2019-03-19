package com.defang.servie;

import com.defang.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findStudentByName(String name);

}
