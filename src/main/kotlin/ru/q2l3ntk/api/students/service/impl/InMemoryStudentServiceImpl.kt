package ru.q2l3ntk.api.students.service.impl

import org.springframework.stereotype.Service
import ru.q2l3ntk.api.students.model.Student
import ru.q2l3ntk.api.students.service.StudentService

@Service
class InMemoryStudentServiceImpl: StudentService {
    override fun findAllStudents(): List<Student> {
        return listOf(
            Student().setFirstName("John").setEmail("john@gmail.com").setAge(41),
            Student().setFirstName("Freddy").setEmail("freddy@gmail.com").setAge(38),
            Student().setFirstName("Anna").setEmail("anna@yandex.ru").setAge(25)
        )
    }
}