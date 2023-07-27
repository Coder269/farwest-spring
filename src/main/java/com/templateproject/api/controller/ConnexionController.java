package com.templateproject.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class ConnexionController {

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
