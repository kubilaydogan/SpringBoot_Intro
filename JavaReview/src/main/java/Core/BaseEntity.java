package Core;

import lombok.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseEntity {

    private long id;
    private LocalDateTime insertDateTime;
    private long insertUserId;
    private LocalDateTime lastUpdateDateTime;
    private long lastUpdateUserId;
}
