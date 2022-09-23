package com.careerdevs.mybankingapp.controllers;

import com.careerdevs.mybankingapp.repositories.AccountRepository;
import com.careerdevs.mybankingapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
* I want this controller to handle everything done with users. Create, patch, delete, etc
* */

@RestController
@RequestMapping("/users")
public class UserController {

    // Give each controller access to make modifications to users/accounts in the database
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AccountRepository accountRepository;

    // Allow admin to get all users within banking system
    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers() {
        try {
            return null;
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    // GET one user by id, bring up all accounts owned by user
    @GetMapping("/id/{id}")
    public ResponseEntity<?> getUserById(@PathVariable String userId) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    // Allow for new user to be created using input form on webpage
    @PostMapping("/create")
    public ResponseEntity<?> createNewUser() {
        try {
            return null;
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
