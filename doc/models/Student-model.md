# Student model
This model is used as the main entity of data manipulation and
of the main parts of the application.
```
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

    fun getId(): Long? = id

    fun getFirstName(): String? = firstName

    fun getLastName(): String? = lastName

    fun getDateOfBirth(): LocalDate? = dateOfBirth

    fun getEmail(): String? = email

    fun getAge(): Int = Period.between(dateOfBirth, LocalDate.now()).years
```