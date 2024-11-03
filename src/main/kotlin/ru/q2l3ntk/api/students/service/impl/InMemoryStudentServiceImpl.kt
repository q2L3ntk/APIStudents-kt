package ru.q2l3ntk.api.students.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.q2l3ntk.api.students.model.Student
import ru.q2l3ntk.api.students.repository.InMemoryStudentDAO
import ru.q2l3ntk.api.students.service.StudentService

@Service
class InMemoryStudentServiceImpl: StudentService {
    @Autowired
    private lateinit var repository: InMemoryStudentDAO

    override fun findAllStudents(): List<Student> {
        return repository.findAllStudents()
    }

    override fun saveStudent(student: Student): Student {
        return repository.saveStudent(student)
    }

    override suspend fun findByEmail(email: String): Student? {
        return repository.findByEmail(email)
    }

    override fun updateStudent(student: Student): Student? {
        return repository.updateStudent(student)
    }

    override suspend fun deleteStudent(email: String) {
        return repository.deleteStudent(email)
    }
}