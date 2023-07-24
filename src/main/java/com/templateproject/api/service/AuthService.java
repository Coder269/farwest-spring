package com.templateproject.api.service;

import org.springframework.stereotype.Service;
import at.favre.lib.crypto.bcrypt.BCrypt;
import com.templateproject.api.entity.User;
import com.templateproject.api.repository.UserRepository;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean register(String username, String password, String cpassword) {
        if (password.equals(cpassword)) {
            String passwordHashed = BCrypt.withDefaults().hashToString(BCrypt.MIN_COST, password.toCharArray());
            User user = new User(username, passwordHashed);
            userRepository.save(user);
            return true;
        }
        return false;
    }

    public boolean login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), user.getPassword());
            return result.verified;
        }
        return false;
    }

}
