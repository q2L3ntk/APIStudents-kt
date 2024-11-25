package ru.q2l3ntk.api.students.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.q2l3ntk.api.students.model.CommonUser

interface UserRepository: JpaRepository<CommonUser, Long> {
    fun findByName(username: String): CommonUser?
}