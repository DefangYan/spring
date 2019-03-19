package com.defang.servie;

import com.defang.dao.StudentDao;
import com.defang.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student>  findStudentByName(String name) {
        return studentDao.findAllByName(name);
    }
}
