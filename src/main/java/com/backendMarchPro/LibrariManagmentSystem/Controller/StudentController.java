package com.backendMarchPro.LibrariManagmentSystem.Controller;

import com.backendMarchPro.LibrariManagmentSystem.Dto.StudentRequestDto;
import com.backendMarchPro.LibrariManagmentSystem.Dto.StudentResponseDto;
import com.backendMarchPro.LibrariManagmentSystem.Dto.StudentUpdateEmailRequestDto;
import com.backendMarchPro.LibrariManagmentSystem.Entity.Student;
import com.backendMarchPro.LibrariManagmentSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){
        studentService.addStudent(studentRequestDto);
        return "Student has been added";
    }

    @GetMapping("/find_by_email")
    public String findStudentByEmail(@RequestParam("email") String email){

        return studentService.findByEmail(email);
    }

    // get students of particular age

    // try for some other attribute also

    @PutMapping("/update_email")
    public StudentResponseDto updateEmail(@RequestBody StudentUpdateEmailRequestDto studentUpdateEmailRequestDto){
        return studentService.updateEmail(studentUpdateEmailRequestDto);
    }
}
