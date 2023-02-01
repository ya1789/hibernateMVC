package org.example.service;


import org.example.dao.UserDAO;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);

    }

    @Override
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);

    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);

    }

    @Override
    public User findUserById(long id) {
        return userDAO.findUserById(id);
    }

    @Override
    public List<User> listUsers() {
        return userDAO.listUsers();
    }
}
