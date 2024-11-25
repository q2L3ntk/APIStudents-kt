package ru.q2l3ntk.api.students.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.q2l3ntk.api.students.model.CommonUser

@Repository
interface UserRepository: JpaRepository<CommonUser, Long> {
    fun findByUsername(username: String): CommonUser?
}