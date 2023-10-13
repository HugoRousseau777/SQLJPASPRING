package com.Springpro.Springpro.Service;

import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

// ??? We don't need a StudentRepoSetter ?

    public Student saveDetails(Student student){
        return studentRepository.save(student);
        /*In postman, go in Body, Select raw and JSON format*/
    }

    public List<Student> fetchAll(){
        return studentRepository.findAll();
    }

    public Optional<Student> fetchById(int id){

        return studentRepository.findById(id);
    }
}
