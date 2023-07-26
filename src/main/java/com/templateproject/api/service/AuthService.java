package com.templateproject.api.service;

import org.springframework.stereotype.Service;
import at.favre.lib.crypto.bcrypt.BCrypt;
import com.templateproject.api.entity.User;
import com.templateproject.api.repository.UserRepository;

import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean register(String username, String password, String cpassword) {
        Optional<User> newUser = userRepository.findByUsername(username);
        if (password.equals(cpassword) && !newUser.isPresent()) {
            String passwordHashed = BCrypt.withDefaults().hashToString(BCrypt.MIN_COST, password.toCharArray());
            User user = new User(username, passwordHashed);
            userRepository.save(user);
            return true;
        }
        return false;

    }

    public String login(String login, String password) {
        Optional<User> user = userRepository.findByUsername(login);
        if (user.isPresent()) {
            BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), user.get().getPassword());
            return user.get().getUsername();
        }
        return null;
    }

}
