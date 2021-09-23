package com.example.demo.controller

import com.example.demo.model.Student
import com.example.demo.service.StudentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("people")
class StudentController(val serviceStudent : StudentService) {

    @GetMapping("/students")
    fun getStudents(): List<Student>  {
        print("Get Students")
        return serviceStudent.findStudents()
    }

    @PostMapping("/student")
    fun postStudent(@RequestBody student : Student){
        print("Post")
        serviceStudent.post(student)
    }

    @PutMapping("/student/{id}")
    fun putStudent(@PathVariable("id") id : String, @RequestBody student: Student){
        println("Post "+id)
        serviceStudent.updateById(id, student)
    }

    @DeleteMapping("/student/{id}")
    fun deleteStudent(@PathVariable("id") id : String){
        println("Delete "+id)
        serviceStudent.deleteById(id)
    }
}