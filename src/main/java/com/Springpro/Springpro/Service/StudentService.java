package com.Springpro.Springpro.Service;

import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.swing.text.html.Option;
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
    public Student updateStudent(Student student){

        Optional<Student> updateStudent = studentRepository.findById(student.getId());
        if(!updateStudent.isPresent()){
            return null;
        }
        Student studentToUpdate = updateStudent.get();
        studentToUpdate.setMark(student.getMark());
        studentToUpdate.setName(student.getName());
        studentRepository.save(studentToUpdate);
        return studentToUpdate;
    }

    public String deleteStudent(int id){
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return id + "deleted";
        } else {
            return "Doesn't exist";
        }

    }
}
