package ru.q2l3ntk.api.students.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import ru.q2l3ntk.api.students.config.CommonUserDetails
import ru.q2l3ntk.api.students.model.CommonUser
import ru.q2l3ntk.api.students.repository.UserRepository

@Service
class CommonUserDetailsService: UserDetailsService {
    @Autowired
    private lateinit var repository: UserRepository

    override fun loadUserByUsername(username: String): UserDetails {
        val user: CommonUser? = repository.findByName(username)
        return CommonUserDetails(user)
    }

    fun addUser(user: CommonUser) {
        repository.save(user)
    }
}