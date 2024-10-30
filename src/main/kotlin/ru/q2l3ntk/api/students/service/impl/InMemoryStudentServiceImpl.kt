package ru.q2l3ntk.api.students.service.impl

import org.springframework.stereotype.Service
import ru.q2l3ntk.api.students.model.Student
import ru.q2l3ntk.api.students.service.StudentService

@Service
class InMemoryStudentServiceImpl: StudentService {
    override fun findAllStudents(): List<Student> {
        TODO("Not yet implemented")
    }

    override fun saveStudent(student: Student): Student {
        TODO("Not yet implemented")
    }

    override fun findByEmail(email: String?): Student {
        TODO("Not yet implemented")
    }

    override fun updateStudent(student: Student): Student {
        TODO("Not yet implemented")
    }

    override fun deleteStudent(email: String?) {
        TODO("Not yet implemented")
    }
}