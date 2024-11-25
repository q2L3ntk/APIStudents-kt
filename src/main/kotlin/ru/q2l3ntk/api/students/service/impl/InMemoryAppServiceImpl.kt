package ru.q2l3ntk.api.students.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.q2l3ntk.api.students.model.Student
import ru.q2l3ntk.api.students.repository.InMemoryStudentDAO
import ru.q2l3ntk.api.students.service.AppService

@Service
class InMemoryAppServiceImpl: AppService {
    @Autowired
    private lateinit var repository: InMemoryStudentDAO

    override fun findAllStudents(): List<Student> = repository.findAllStudents()

    override fun saveStudent(student: Student): Student = repository.saveStudent(student)

    override fun findByEmail(email: String): Student? = repository.findByEmail(email)

    override fun updateStudent(student: Student): Student? = repository.updateStudent(student)

    override fun deleteStudent(email: String) = repository.deleteStudent(email)
}