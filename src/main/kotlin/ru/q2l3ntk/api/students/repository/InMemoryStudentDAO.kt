package ru.q2l3ntk.api.students.repository

import kotlinx.coroutines.flow.*
import ru.q2l3ntk.api.students.model.Student

class InMemoryStudentDAO {
    private var STUDENTS = mutableListOf<Student>()

    fun findAllStudents(): List<Student> {
        return STUDENTS
    }

    fun saveStudent(student: Student): Student {
        STUDENTS.add(student)
        return student
    }

    suspend fun findByEmail(email: String): Student? {
        val student: Student? = STUDENTS.asFlow().filter { students -> students.getEmail().equals(email) }.firstOrNull()
        return student
    }

    suspend fun updateStudent(student: Student): Student? {
        val studentsFound = STUDENTS.asFlow().filter { index -> Function STUDENTS.get(STUDENTS.size - 1).getEmail().equals(student.getEmail()) }.firstOrNull()

        if (studentsFound != null) {
            return studentsFound
        }

        return null
    }

    fun deleteStudent(email: String?) {
        TODO("Not yet implemented")
    }
}