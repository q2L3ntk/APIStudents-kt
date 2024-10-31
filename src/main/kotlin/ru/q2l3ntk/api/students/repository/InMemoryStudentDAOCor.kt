package ru.q2l3ntk.api.students.repository

import kotlinx.coroutines.flow.*
import ru.q2l3ntk.api.students.model.Student

class InMemoryStudentDAOCor {
    private var STUDENTS = mutableListOf<Student>()

    fun findAllStudents(): List<Student> {
        return STUDENTS
    }

    fun saveStudent(student: Student): Student {
        STUDENTS.add(student)
        return student
    }

    suspend fun findByEmail(email: String): Student? {
        var student = Student() ?: null
        student = STUDENTS.asFlow().filter { students -> students.getEmail().equals(email) }.firstOrNull()
        return student
    }

    fun updateStudent(student: Student): Student {
        TODO("Not yet implemented")
    }

    fun deleteStudent(email: String?) {
        TODO("Not yet implemented")
    }
}