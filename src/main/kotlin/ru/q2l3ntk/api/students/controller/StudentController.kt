package ru.q2l3ntk.api.students.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import ru.q2l3ntk.api.students.model.Student
import ru.q2l3ntk.api.students.service.StudentService

@RestController
@RequestMapping("/api/v1/students")
class StudentController {
    @Qualifier("studentServiceImpl")
    @Autowired //Outdated
    private lateinit var service: StudentService

    @GetMapping
    fun findAllStudents(): List<Student> {
        return service.findAllStudents()
    }

    @PostMapping("save_student")
    fun saveStudent(@RequestBody student: Student): String {
        service.saveStudent(student)
        return "Student successfully saved"
    }

    @GetMapping("/{email}")
    fun findByEmail(@PathVariable email: String): Student? {
        return service.findByEmail(email)
    }

    @PutMapping("update_student")
    fun updateStudent(@RequestBody student: Student): Student? {
        return service.updateStudent(student)
    }

    @DeleteMapping("delete_student/{email}")
    @Transactional
    fun deleteStudent(@PathVariable email: String) {
        service.deleteStudent(email)
    }
}