package com.templateproject.api.service;

import com.templateproject.api.entity.User;
import com.templateproject.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByUsername(String username){
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    @Transactional
    public void updateUserMoney(int userId, int money){
        userRepository.UpdateUserMoney(userId, money);
    }

    @Override
    @Transactional
    public void updateUserLevel(int userId, int level){
        userRepository.UpdateUserLevel(userId, level);
    }

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user){
        return userRepository.save(user);
    }
}