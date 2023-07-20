package com.templateproject.api.controller;

import com.templateproject.api.controller.entity.UserRegister;
import com.templateproject.api.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;

    AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public String register(@RequestBody UserRegister user) {
        boolean isRegistered = authService.register(user.getUsername(), user.getEmail(), user.getPassword(),
                user.getCpassword());
        return isRegistered ? user.getUsername() + "is registed " : "register failed !!!";
    }

}
