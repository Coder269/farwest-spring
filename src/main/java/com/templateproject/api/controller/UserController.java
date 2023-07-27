package com.templateproject.api.controller;

import com.templateproject.api.entity.User;
import com.templateproject.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @PutMapping("/update-user")
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.updateUser(user), HttpStatus.OK);
    }

    @DeleteMapping("/delete-user/{username}")
    public ResponseEntity<?> deleteUserByUsername(@PathVariable("username") String username) {
        userService.deleteUserByUsername(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/user-info/{username}")
    public ResponseEntity<?> findUserByUsername(@PathVariable("username") String username) {
        return new ResponseEntity<>(userService.findUserByUsername(username), HttpStatus.OK);
    }

    @PutMapping("/update-level/{id}")
    public ResponseEntity<?> updateUserLevel(@PathVariable("id") int id, @RequestBody int level) {
        userService.updateUserLevel(id, level);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update-money/{id}")
    public ResponseEntity<?> updateUserMoney(@PathVariable("id") int id, @RequestBody int money) {
        userService.updateUserMoney(id, money);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
