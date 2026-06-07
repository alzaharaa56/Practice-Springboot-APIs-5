package com.example.Practice_Springboot_APIs_5;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {




        Student student = new Student(100,"Ahmed","A");

        @PutMapping("/updateStudent")
        public String updateStudent(@RequestParam String name){
            String oldName = student.getStudentName();
            student.setStudentName(name);

            return "Student name updated successfully from : " + oldName + " to " + student.getStudentName();
        }
    }

