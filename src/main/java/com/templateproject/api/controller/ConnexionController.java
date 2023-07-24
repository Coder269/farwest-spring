package com.templateproject.api.controller;

import org.springframework.web.bind.annotation.GetMapping;

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
