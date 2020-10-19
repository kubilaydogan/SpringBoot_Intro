package Core;

import Core.Enums.Gender;
import lombok.*;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private Role role;
    private Gender gender;

    public User(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime,
                long lastUpdateUserId, String firstname, String lastname, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstname;
        this.lastName = lastname;
        this.role = role;
        this.gender = gender;
    }
}
