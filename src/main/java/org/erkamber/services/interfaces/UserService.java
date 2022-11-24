package org.erkamber.services.interfaces;

import org.erkamber.dtos.UserDto;

import java.util.List;

public interface UserService {

    void userLogIn(String username, String password);

    void userRegister(UserDto registeredUserDto);

    UserDto findUserByID(int searchedUserID);

    List<UserDto> getAllUsers();
}