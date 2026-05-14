package cgpa_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cgpa_backend.model.Student;
import cgpa_backend.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/calculate")
    public Student calculate(@RequestBody Student student) {
        return service.calculate(student);
    }
}