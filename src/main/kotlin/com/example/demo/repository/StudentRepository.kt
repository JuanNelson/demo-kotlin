package com.example.demo.repository

import com.example.demo.model.Student
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface StudentRepository  : CrudRepository<Student, String> {

    @Query("select * from student")
    fun findStudents():List<Student>

}