package Core.abstraction.implementation;

import Core.User;

public interface UserServiceImplement {

    String userByRoleId(int id);
    User userByFirstName(String firstName);
}
