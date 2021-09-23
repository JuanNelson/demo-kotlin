package com.example.demo.service

import com.example.demo.model.Student
import com.example.demo.repository.StudentRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentService(val db: StudentRepository) {

    fun findStudents(): List<Student> = db.findStudents()

    fun post(student : Student){
        db.save(student)
    }

    fun updateById(id : String, student : Student){
        val response : Optional<Student> = db.findById(id);
        if(response.isPresent){
            println("Se encontro al estudiante")
            val responseEstudent = response.get()
            responseEstudent.name = student.name
            responseEstudent.lastName = student.lastName
            responseEstudent.age = student.age
            responseEstudent.grade = student.grade
            db.save(responseEstudent)
        }
    }

    fun deleteById(id : String){
        db.deleteById(id)
    }

}