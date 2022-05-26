package org.example.dao;

import org.example.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDAOImliment implements UserDAO {

    @Autowired
    private EntityManager entityManager;


    @Override
    public List<UserDto> getAllUsers() {
        Query query = entityManager.createQuery("from UserDto");
        List<UserDto> allUsers = query.getResultList();

        return allUsers;
    }


    @Override
    public void saveUser(UserDto user) {
        entityManager.merge(user);

    }


    @Override
    public UserDto getOneUser(int id) {
        UserDto userDto = entityManager.find(UserDto.class, id);

        return userDto;
    }


    @Override
    public void deleteUser(int id) {
        Query query = entityManager.createQuery("DELETE FROM UserDto where id =:userId");
        query.setParameter("userId", id);
        query.executeUpdate();
    }


    @Override
    public List<UserDto> getUserByCompany(String company) {
        Query query = entityManager.createQuery("from UserDto WHERE company =:comp");
        query.setParameter("comp", company);
        List<UserDto> result = query.getResultList();

        return result;
    }
}
