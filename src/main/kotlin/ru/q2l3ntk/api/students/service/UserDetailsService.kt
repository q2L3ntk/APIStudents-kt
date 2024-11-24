package ru.q2l3ntk.api.students.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import ru.q2l3ntk.api.students.repository.UserRepository

@Service
class UserDetailsService : UserDetailsService {
    @Autowired
    private lateinit var repository: UserRepository

    override fun loadUserByUsername(username: String?): UserDetails {
        TODO("Not yet implemented")
    }
}
