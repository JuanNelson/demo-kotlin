package com.example.demo.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("STUDENT")
class Student(
        @Id val id: String?,
        var name: String,
        @Column("LASTNAME")var lastName: String,
        var grade: String,
        var age: Int
) {}