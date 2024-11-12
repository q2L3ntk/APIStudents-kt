package ru.q2l3ntk.api.students.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.q2l3ntk.api.students.model.Student
import ru.q2l3ntk.api.students.repository.StudentRepository
import ru.q2l3ntk.api.students.service.StudentService

@Service
class StudentServiceImpl: StudentService {
    @Autowired
    private lateinit var repository: StudentRepository

    override fun findAllStudents(): List<Student> {
        return repository.findAll()
    }

    override fun saveStudent(student: Student): Student {
        return repository.save(student)
    }

    override fun findByEmail(email: String): Student? {
        return repository.findStudentByEmail(email)
    }

    override fun updateStudent(student: Student): Student? {
        return repository.save(student)
    }

    override fun deleteStudent(email: String) {
        repository.deleteByEmail(email)
    }
}