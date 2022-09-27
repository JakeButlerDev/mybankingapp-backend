package com.careerdevs.mybankingapp.controllers;

import com.careerdevs.mybankingapp.models.CheckingModel;
import com.careerdevs.mybankingapp.models.UserModel;
import com.careerdevs.mybankingapp.repositories.AccountRepository;
import com.careerdevs.mybankingapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

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
    public ResponseEntity<?> getAllTransChecking(@PathVariable UUID id) {
        try {
            AccountRepository record = this.accountRepository.findOneByUuid(id);
            return ResponseEntity.ok(record.toString());
//            //TODO: Below is to find all accounts, I want all transactions within that account
//            ArrayList<AccountModel> allAccounts =  (ArrayList <AccountModel>) accountRepository.findAll();
//            return ResponseEntity.ok(allAccounts);
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
            ArrayList<CheckingModel> allAccounts =  (ArrayList <CheckingModel>) accountRepository.findAll();
            return ResponseEntity.ok(allAccounts);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping("/deposit")
    public ResponseEntity<?> depositChecking(@PathVariable double amount, @PathVariable String acctId) {
        //TODO: Troubleshoot below, prompted for iterable within findById()
//        ArrayList<AccountModel> foundAccount = (ArrayList<AccountModel>) accountRepository.findAllById(userId);
        return null;
    }

    @PostMapping("/withdraw")
    public ResponseEntity<?> withdrawChecking(@PathVariable double amount, @PathVariable UUID acctId) {
        try {
            CheckingModel record = this.accountRepository.findOneByUuid(acctId);
            CheckingModel.setBalanceWithdrawal(amount);
            return ResponseEntity.ok(record);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> getAllUserAccounts(@PathVariable String userId) {
        try {
            Optional<UserModel> foundUser = userRepository.findByUserId(userId);
            ArrayList<Optional> foundAccounts = foundUser.getAccounts();

            return ResponseEntity.ok(foundAccounts.get());

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //TODO: Better error handling everywhere!!

}
