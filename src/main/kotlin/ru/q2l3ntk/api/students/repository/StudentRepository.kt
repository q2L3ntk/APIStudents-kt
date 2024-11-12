package ru.q2l3ntk.api.students.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.q2l3ntk.api.students.model.Student

interface StudentRepository: JpaRepository<Student, Long> {
    fun findStudentByEmail(email: String): Student?
    fun deleteByEmail(email: String)
}