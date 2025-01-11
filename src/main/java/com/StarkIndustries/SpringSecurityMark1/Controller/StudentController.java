package com.StarkIndustries.SpringSecurityMark1.Controller;

import com.StarkIndustries.SpringSecurityMark1.Model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // Initialize a mutable list of students
    List<Student> studentList = new ArrayList<>(List.of(
            new Student("2021FHCO042", "Aditya", "Computer-Engineering", "Be"),
            new Student("2021FHCO041", "Sandesh", "Computer-Engineering", "Be"),
            new Student("2021FHCO056", "Mayur", "Computer-Engineering", "Be"),
            new Student("2021FHCO047", "Vinay", "Computer-Engineering", "Be")
    ));

    @GetMapping("/students")
    public List<Student> studentPage() {
        return studentList;
    }

    @PostMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        // Add the new student to the mutable list
        studentList.add(student);
        return student;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
