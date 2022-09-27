package com.careerdevs.mybankingapp.controllers;

import com.careerdevs.mybankingapp.models.UserModel;
import com.careerdevs.mybankingapp.repositories.AccountRepository;
import com.careerdevs.mybankingapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
            ArrayList<UserModel> allUsers = (ArrayList<UserModel>) userRepository.findAll();

            return ResponseEntity.ok(allUsers);
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
            Optional<UserModel> foundUser = userRepository.findByUserId(userId);
            return ResponseEntity.ok(foundUser);
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
            UserModel newUser = new UserModel();

            return ResponseEntity.ok(newUser);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
