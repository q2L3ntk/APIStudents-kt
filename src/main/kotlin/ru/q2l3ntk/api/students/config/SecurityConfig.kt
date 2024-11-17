package ru.q2l3ntk.api.students.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun userDetailsService(encoder: PasswordEncoder): UserDetailsService {
        val admin: UserDetails = User.builder().username("admin").password(encoder.encode("admin")).build()
        val user: UserDetails = User.builder().username("user").password(encoder.encode("user")).build()

        return InMemoryUserDetailsManager(admin, user)
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }
}