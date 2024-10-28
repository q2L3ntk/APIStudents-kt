package ru.q2l3ntk.api.students.service

import ru.q2l3ntk.api.students.model.Student

interface StudentService {
    fun findAllStudents(): List<Student>
}