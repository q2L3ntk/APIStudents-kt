package ru.q2l3ntk.api.students.model

import jakarta.persistence.*
import lombok.Data

@Data
@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null
    @Column(unique = true)
    private var name: String? = null
    private var password: String? = null
    private var roles: String? = null
}