package ru.q2l3ntk.api.students.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.q2l3ntk.api.students.model.Student
import ru.q2l3ntk.api.students.service.StudentService

@RestController
@RequestMapping("/api/v1/students")
class StudentController {
    @Autowired
    private lateinit var service: StudentService

    @GetMapping
    fun findAllStudents(): List<Student> {
        return service.findAllStudents()
    }
}