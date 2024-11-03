package ru.q2l3ntk.api.students.model

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import lombok.Builder
import lombok.Data
import java.time.LocalDate

@Data
@Builder
@Serializable
class Student {
    private var firstName: String? = null
    private var lastName: String? = null
    @Contextual
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

    fun getEmail(): String? {
        return this.email
    }

    fun setAge(age: Int?): Student {
        this.age = age
        return this
    }
}