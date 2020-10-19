package Core.abstraction.service;

import Core.Enums.Gender;
import Core.Role;
import Core.User;
import Core.abstraction.implementation.UserServiceImplement;

public class UserService implements UserServiceImplement {

    @Override
    public String userByRoleId(int id) {
        User user = new User("Mike","Smith",new Role(id,"Manager"), Gender.MALE);
        return user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User(firstName,"Smith",new Role(1,"Employee"),Gender.MALE);
        return user;
    }
}
