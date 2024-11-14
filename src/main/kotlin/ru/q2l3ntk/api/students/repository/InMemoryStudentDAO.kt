package ru.q2l3ntk.api.students.repository

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Repository
import ru.q2l3ntk.api.students.model.Student

@Repository
class InMemoryStudentDAO {
    private var STUDENTS = mutableListOf<Student>()

    fun findAllStudents(): List<Student> {
        return STUDENTS
    }

    fun saveStudent(student: Student): Student {
        STUDENTS.add(student)
        return student
    }

    fun findByEmail(email: String) = runBlocking {
        return@runBlocking STUDENTS.asFlow().filter { element -> element.getEmail().equals(email) }.firstOrNull()
    }

    fun updateStudent(student: Student) = runBlocking {
        val studentIndex = flowOf(0, STUDENTS.size - 1)
            .filter { index -> STUDENTS.get(index).getEmail().equals(student.getEmail()) }
            .first()
            .or(-1)

        if (studentIndex > -1) {
            STUDENTS.set(studentIndex, student)
            return@runBlocking student
        }

        return@runBlocking null
    }

    fun deleteStudent(email: String) {
        val student = findByEmail(email)

        if (student != null) {
            STUDENTS.remove(student)
        }
    }
}