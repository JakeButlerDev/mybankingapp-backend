package com.careerdevs.mybankingapp.controllers;

import com.careerdevs.mybankingapp.models.CheckingModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* What am I looking to accomplish with this class?
    - POST a deposit or withdrawal
    - GET all previous transactions for any given account
    - PUT account information such as contact info, password
    - GET all transaction fees paid to date?
 */

@RestController
@RequestMapping("/checking")
public class CheckingController {

//    private String accountNumber;     Use UUID as generation method
//    private double balance;
//    private double transactionFee;
//    private String accountHolder;


    @GetMapping("/")
    public ResponseEntity<?> getAllTransactions() {

        return null;
    }

    @PostMapping("/deposit")
    public ResponseEntity<?> depositFunds() {
        return null;
    }

    @PostMapping("/withdraw")
    public ResponseEntity<?> withdrawFunds() {
        return null;
    }
}
