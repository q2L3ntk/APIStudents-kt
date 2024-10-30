package ru.q2l3ntk.api.students.repository

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

    fun findByEmail(email: String): Student {
        return STUDENTS.stream().filter { element -> element.email.equals(email) }
            .findFirst()
            .orElse(null)
    }

    fun updateStudent(student: Student): Student {
        TODO("Not yet implemented")
    }

    fun deleteStudent(email: String?) {
        TODO("Not yet implemented")
    }
}