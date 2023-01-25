package com.Accio.StudentManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer, Student> db = new HashMap<>();
    @GetMapping("/get_student")
    public Student get_student(@RequestParam("admNo") int admNo){
        return db.get(admNo);
    }

    @PostMapping("/add_student")
    public String add_student(@RequestBody Student student){
        if(student ==  null) return "Invalid data";

        int admNo = student.getAdmNo();
        db.put(admNo, student);
        return "Student added successfully";
    }
    @PutMapping("update_student")
    public String update_student(@RequestParam("id") int id, @RequestBody Student student){
        db.put(id, student);
        return "Student details updated";
    }
    @DeleteMapping("delete_student")
    public String delete_student(@RequestParam("id") int id){
        db.remove(id);
        return "Student Deleted";
    }
}
