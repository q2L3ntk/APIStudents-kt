package ru.q2l3ntk.api.students.model

import jakarta.persistence.*
import lombok.Data
import java.time.LocalDate
import kotlin.jvm.Transient

@Data
@Entity
@Table(name = "students")
class Student {
    @Id
    @GeneratedValue
    private var id: Long? = null
    private var firstName: String? = null
    private var lastName: String? = null
    private var dateOfBirth: LocalDate? = null
    @Column(unique = true)
    private var email: String? = null
    @Transient
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