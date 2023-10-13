package com.Springpro.Springpro.Controller;

import com.Springpro.Springpro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Repository.StudentRepository;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/fetchById/{id}")
    public Optional<Student> getById(@PathVariable int id){
        return studentService.fetchById(id);
    }
}
