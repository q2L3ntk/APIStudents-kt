package ru.q2l3ntk.api.students.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.invoke
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun userDetailsService(encoder: PasswordEncoder): UserDetailsService {
        val admin: UserDetails = User.builder().username("admin").password(encoder.encode("admin")).roles("ADMIN").build()
        val user: UserDetails = User.builder().username("user").password(encoder.encode("user")).roles("USER").build()

        return InMemoryUserDetailsManager(admin, user)
    }

    @Order(1)
    @Bean
    fun apiFilterChain(http: HttpSecurity): SecurityFilterChain {
        http {
            csrf { disable() }
            securityMatcher(
                "api/v1/students/save_student",
                "api/v1/students/update_student",
                "api/v1/students/delete_student"
            )
            authorizeRequests { authorize(anyRequest, hasRole("ADMIN")) }
            httpBasic { }
        }

        return http.build()
    }

    @Bean
    fun formFilterChain(http: HttpSecurity): SecurityFilterChain {
        http {
            csrf { disable() }
            authorizeHttpRequests { authorize(anyRequest, authenticated) }
            formLogin { }
        }

        return http.build()
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }
}