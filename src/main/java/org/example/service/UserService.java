package org.example.service;


import org.example.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User findUserById(long id);

    List<User> listUsers();
}
