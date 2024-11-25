# Repositories
Classes implementing work with database, creating and deleting users.
## Student repository
```
interface StudentRepository: JpaRepository<Student, Long> {
    fun findStudentByEmail(email: String): Student?
    fun deleteByEmail(email: String)
}
```
## User repository
```
interface UserRepository: JpaRepository<CommonUser, Long> {
    fun findByName(username: String): CommonUser?
}
```