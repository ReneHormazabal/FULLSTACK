package com.ejemplo.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>();

    @GetMapping("/students")
    public List<Student> getStudents() {
        
        students.add(new Student(1, "Juan"));
        students.add(new Student(2, "Pedro"));
        students.add(new Student(3, "Maria"));
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        for(Student student : students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }
    


    
}
