package ru.q2l3ntk.api.students.model

import lombok.Builder
import lombok.Data
import java.time.LocalDate

@Data
@Builder
class Student {
    private var firstName: String? = null
    private var lastName: String? = null
    private var dateOfBirth: LocalDate? = null
    private var email: String? = null
    private var age: Int? = null

    fun getFirstName(): String? {
        return this.firstName
    }

    fun getLastName(): String? {
        return this.lastName
    }

    fun getDateOfBirth(): LocalDate? {
        return this.dateOfBirth
    }

    fun getEmail(): String? {
        return this.email
    }

    fun getAge(): Int? {
        return this.age
    }
}