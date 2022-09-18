package com.careerdevs.mybankingapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    /* What am I looking to accomplish with this class?
    - POST a deposit or withdrawal
    - GET all previous transactions for any given account
    - PUT account information such as contact info, password
    - GET all transaction fees paid to date?
 */



//    private String accountNumber;     Use UUID as generation method
//    private double balance;
//    private double transactionFee;
//    private String accountHolder;

    @GetMapping("/chk_trns")   // Used not easily identifiable endpoint to discourage unauthorized traffic
    public ResponseEntity<?> getAllTransChecking() {

        return null;
    }

    @GetMapping("/sav_trns")   // Used not easily identifiable endpoint to discourage unauthorized traffic
    public ResponseEntity<?> getAllTransSaving() {

        return null;
    }

    @PostMapping("/deposit")
    public ResponseEntity<?> depositChecking() {
        return null;
    }

    @PostMapping("/withdraw")
    public ResponseEntity<?> withdrawChecking() {
        return null;
    }

//    @GetMapping("/acct/{id}")
//    public ResponseEntity<?>

}
