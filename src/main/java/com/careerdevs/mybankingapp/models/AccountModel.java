package com.careerdevs.mybankingapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class AccountModel {

    @Id
    private String accountNumber;       // Use UUID as generation method, when account is first created


    public class CheckingAcct {
        private double balance;
        private double transactionFee;
        private String accountHolder;


        public double getBalance() {
            return balance;
        }
        public double getTransactionFee() {
            return transactionFee;
        }
        public String getAccountHolder() {
            return accountHolder;
        }


    }

    public class SavingsAcct {
        private double balance;
        private String accountHolder;

        public double getBalance() {
            return balance;
        }
        public String getAccountHolder() {
            return accountHolder;
        }

    }

//    private Contact contactInfo;  Wonder if I have to move the constructor class inside each class to function properly



    public String getAccountNumber() {
        return accountNumber;
    }



}
