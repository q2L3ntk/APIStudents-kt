# User model
The user model is designed to implement the functionality of the application.
```
@Data
@Entity
@Table(name = "users")
public class CommonUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private String password;
    private String roles;
}
```