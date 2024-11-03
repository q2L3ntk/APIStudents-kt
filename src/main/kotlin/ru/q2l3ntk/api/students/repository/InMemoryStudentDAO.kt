package ru.q2l3ntk.api.students.repository

import kotlinx.coroutines.flow.*
import ru.q2l3ntk.api.students.model.Student
import java.util.stream.IntStream

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

    fun updateStudent(student: Student): Student? {
        // This index was found by IntStream and this is not recommended. There is a way to do it with coroutines
        val studentIndex = IntStream.range(0, STUDENTS.size - 1)
            .filter { index -> STUDENTS.get(index).getEmail().equals(student.getEmail()) }
            .findFirst()
            .orElse(-1)

        if (studentIndex > -1) {
            STUDENTS.set(studentIndex, student)
            return student
        }

        return null
    }

    fun deleteStudent(email: String?) {
        TODO("Not yet implemented")
    }
}