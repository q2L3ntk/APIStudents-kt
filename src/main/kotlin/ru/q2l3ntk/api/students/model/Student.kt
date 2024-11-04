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

    fun setFirstName(firstName: String?): Student {
        this.firstName = firstName
        return this
    }

    fun setLastName(lastName: String?): Student {
        this.lastName = lastName
        return this
    }

    fun setDateOfBirth(dateOfBirth: LocalDate?): Student {
        this.dateOfBirth = dateOfBirth
        return this
    }

    fun setEmail(email: String?): Student {
        this.email = email
        return this
    }

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

    fun setAge(age: Int?): Student {
        this.age = age
        return this
    }
}