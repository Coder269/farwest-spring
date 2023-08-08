package com.templateproject.api.service;

import com.templateproject.api.entity.User;

import java.util.List;

public interface UserService {

    User findUserByUsername(String username);

    void updateUserMoney(int userId, int money);

    void updateUserLevel(int userId, int level);

    User createUser(User user);

    User updateUser(User user);

    void deleteUserById(int id);

    void deleteUserByUsername(String username);

    List<User> getAllUsers();
}
