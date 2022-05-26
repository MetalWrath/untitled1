package org.example.dao;


import org.example.dto.UserDto;
import java.util.List;



public interface UserDAO {
    public List<UserDto> getAllUsers();

    public void saveUser(UserDto user);

    public UserDto getOneUser(int id);

    public void  deleteUser(int id);

    public List<UserDto> getUserByCompany(String company);
}
