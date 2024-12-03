package com.example.demo;


import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {


    StudentService studentService = new StudentService();

    @PostMapping
    public ResponseEntity<String> save() {
        Student student = new Student();
        student.setName("davier");
        studentService.create(student);
        return ResponseEntity.ok("");
    }
}
