package Core;

import Core.Enums.Gender;
import Core.Enums.Status;
import Core.abstraction.implementation.UserServiceImplement;
import Core.abstraction.service.UserService;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        //**********OOP-Encapsulation**********//
        User user = new User("Mike","Smith",new Role(1,"Manager"),Gender.MALE);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());

        //**********OOP-Inheritance**********//
        Project project = new Project(1, LocalDateTime.now(),1,
                LocalDateTime.now().plusHours(1),1,"PRJ001","Human Resource CRM",
                new User("Mike","Smith",new Role(1,"Manager"),Gender.MALE),
                LocalDate.now(), LocalDate.now().plusDays(6), Status.IN_PROGRESS,"HCRM Detail Information");


        //**********OOP-Interface**********//
        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("Ozzy").getLastName());

        //**********OOP-Polymorphism**********//
        Employee employee = new Employee();
        BaseEntity employee2 = new Employee();
        UserServiceImplement userService2 = new UserService();

        employee.getEmployeeHours();
        ((Employee)employee2).getEmployeeHours(); //Down Casting

        //**********ENUM**********//
        System.out.println(Gender.MALE);
        System.out.println(Status.IN_PROGRESS.getValue().substring(2));

        //**********Collections**********//
        Utils.createList();
        Utils.createUserList();
        Utils.createRoleList().get(0).getDescription();

    }
}
