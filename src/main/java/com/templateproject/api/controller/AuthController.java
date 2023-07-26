package com.templateproject.api.controller;

import com.templateproject.api.controller.payload.UserLogin;
import com.templateproject.api.controller.payload.UserRegister;
import com.templateproject.api.service.AuthService;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> register(@RequestBody UserRegister user) {
        boolean isRegisted = authService.register(
                user.getUsername(),
                user.getPassword(),
                user.getCpassword());
        if (isRegisted)
            return new ResponseEntity<>(user.getUsername() + " is registed !", HttpStatus.OK);
        else
            return new ResponseEntity<>("Register Failed ....", HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(HttpServletRequest request, @RequestBody UserLogin user) {
        String userID = authService.login(user.getUsername(), user.getPassword());
        if (userID != null) {
            request.getSession().setAttribute("Nom du joueur", userID);
            return new ResponseEntity<>(user.getUsername() + " is connected", HttpStatus.OK);
        } else
            return new ResponseEntity<>("Authentication Failed !", HttpStatus.BAD_REQUEST);
    }
}
