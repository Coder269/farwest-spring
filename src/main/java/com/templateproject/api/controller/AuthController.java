package com.templateproject.api.controller;

import com.templateproject.api.controller.payload.UserLogin;
import com.templateproject.api.controller.payload.UserRegister;
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
        boolean isRegistered = authService.register(user.getUsername(), user.getPassword(),
                user.getCpassword());
        return isRegistered ? user.getUsername() + "is registed " : "register failed !!!";
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLogin user) {
        var isLogin = authService.login(user.getUsername(), user.getPassword());
        return isLogin ? user.getUsername() + " is connected" : "Authentication Failed !";
    }
}
