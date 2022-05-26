package org.example.service;

import org.example.dao.UserDAO;
import org.example.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpliment implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<UserDto> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(UserDto user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public UserDto getOneUser(int id) {
        return userDAO.getOneUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    @Transactional
    public List<UserDto> getUserByCompany(String company) {
        return userDAO.getUserByCompany(company);
    }
}
