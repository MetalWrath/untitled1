package org.example.service;

import org.example.dto.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> getAllUsers();

    public void saveUser(UserDto user);

    public UserDto getOneUser(int id);

    public void deleteUser(int id);

    public List<UserDto> getUserByCompany(String company);
}
