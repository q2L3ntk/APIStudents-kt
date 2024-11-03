package ru.q2l3ntk.api.students.service

import ru.q2l3ntk.api.students.model.Student

interface StudentService {
    fun findAllStudents(): List<Student>
    fun saveStudent(student: Student): Student
    suspend fun findByEmail(email: String): Student?
    fun updateStudent(student: Student): Student?
    suspend fun deleteStudent(email: String)
}