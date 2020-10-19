package Core;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee extends BaseEntity {

    private int employeeId;
    private String employeeTask;
    private User employeeManager;

    public void getEmployeeHours(){

        System.out.println("40 hours a week");
    }
}
