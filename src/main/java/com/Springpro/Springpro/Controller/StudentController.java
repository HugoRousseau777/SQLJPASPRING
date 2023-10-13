package com.Springpro.Springpro.Controller;

import com.Springpro.Springpro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Repository.StudentRepository;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addDetails")
    public Student postDetails(@RequestBody Student student){
        return studentService.saveDetails(student);
    }

    @GetMapping("/fetchAll")
    public List<Student> getAll(){
        return studentService.fetchAll();
    }
}
