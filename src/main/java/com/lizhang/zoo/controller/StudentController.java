package com.lizhang.zoo.controller;

import com.lizhang.zoo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudentInfo() {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student("Lily", 7, "Tom", "test@email.com", 80, 85, 90);
        Student student2 = new Student("Lucy", 7, "Jone", "test@email.com", 77, 59, 88);

        studentList.add(student);
        studentList.add(student2);
        return studentList;
    }
}
