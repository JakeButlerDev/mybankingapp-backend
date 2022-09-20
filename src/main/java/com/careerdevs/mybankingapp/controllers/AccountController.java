package com.careerdevs.mybankingapp.controllers;

import com.careerdevs.mybankingapp.models.AccountModel;
import com.careerdevs.mybankingapp.repositories.AccountRepository;
import com.careerdevs.mybankingapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

    /* What am I looking to accomplish with this class?
    - POST a deposit or withdrawal
    - GET all previous transactions for any given account
    - PUT account information such as contact info, password
    - GET all transaction fees paid to date?
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    // Give each controller access to make modifications to users/accounts in the database
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private UserRepository userRepository;


    // Want to GET all transactions from all Checking and all Savings to display to user when they look deeper into account
    @GetMapping("/checking/all")
    public ResponseEntity<?> getAllTransChecking() {
        try {
            //TODO: Below is to find all accounts, I want all transactions within that account
            ArrayList<AccountModel> allAccounts =  (ArrayList <AccountModel>) accountRepository.findAll();
            return ResponseEntity.ok(allAccounts);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/savings/all")
    public ResponseEntity<?> getAllTransSaving() {
        try {
            //TODO: Below is to find all accounts, I want all transactions within that account
            ArrayList<AccountModel> allAccounts =  (ArrayList <AccountModel>) accountRepository.findAll();
            return ResponseEntity.ok(allAccounts);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping("/deposit")
    public ResponseEntity<?> depositChecking() {
        return null;
    }

    @PostMapping("/withdraw")
    public ResponseEntity<?> withdrawChecking() {
        return null;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> getAllUserAccounts(@PathVariable String id) {
        try {
            //TODO: Troubleshoot below, prompted for iterable within findAllById()
//            int userId = parseInt(id);
//            ArrayList<AccountModel> allAccounts = (ArrayList<AccountModel>) accountRepository.findAllById(userId);
//            return ResponseEntity.ok(allAccounts);
            return null;
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //TODO: Better error handling everywhere!!

}
