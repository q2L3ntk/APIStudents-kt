package ru.q2l3ntk.api.students.service

import ru.q2l3ntk.api.students.model.Student

interface AppService {
    fun findAllStudents(): List<Student>
    fun saveStudent(student: Student): Student
    fun findByEmail(email: String): Student?
    fun updateStudent(student: Student): Student?
    fun deleteStudent(email: String)
}