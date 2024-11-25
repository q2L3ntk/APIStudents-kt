# Services
The services are designed to implement manipulation with data. They are the second most important objects in the application.
## App service
```
interface AppService {
    fun findAllStudents(): List<Student>
    fun saveStudent(student: Student): Student
    fun findByEmail(email: String): Student?
    fun updateStudent(student: Student): Student?
    fun deleteStudent(email: String)
}
```
## User service
```
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
```