package org.example.dao;


import org.example.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    User findUserById(long id);

    List<User> listUsers();
}
