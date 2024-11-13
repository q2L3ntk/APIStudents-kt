package ru.q2l3ntk.api.students.model

import jakarta.persistence.*
import lombok.Data
import java.time.LocalDate
import java.time.Period
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

    fun getId(): Long? {
        return id
    }

    fun getFirstName(): String? {
        return firstName
    }

    fun getLastName(): String? {
        return lastName
    }

    fun getDateOfBirth(): LocalDate? {
        return dateOfBirth
    }

    fun getEmail(): String? {
        return email
    }

    fun getAge(): Int {
        return Period.between(dateOfBirth, LocalDate.now()).years
    }
}