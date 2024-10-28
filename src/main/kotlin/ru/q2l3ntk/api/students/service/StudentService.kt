package ru.q2l3ntk.api.students.service

import org.springframework.stereotype.Service
import ru.q2l3ntk.api.students.model.Student

@Service
class StudentService {
    fun findAllStudents(): List<Student>{
        return listOf(
            Student().setFirstName("John").setEmail("john.doe@gmail.com").setAge(41),
            Student().setFirstName("Freddy").setEmail("freddy.doe@gmail.com").setAge(38),
            Student().setFirstName("Anna").setEmail("anna123@yandex.ru").setAge(25),
        )
    }
}