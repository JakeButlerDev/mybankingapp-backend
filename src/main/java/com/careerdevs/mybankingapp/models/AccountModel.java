package com.careerdevs.mybankingapp.models;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "accounts")
//@CrossOrigin()        Remember to set a localhost so front end can interact with backend
public class AccountModel {

    @Id
    private final String accountNumber = UUID.randomUUID().toString();
    // Use UUID as generation method, when account is first created


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


        public void setBalanceDeposit(double amount) {
            this.balance += amount;
        }
        public void setBalanceWithdrawal(double amount) {
            this.balance -= amount;
        }

        // Would want a transfer method as well to move money between accounts
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

        public void setBalanceDeposit(double amount) {
            this.balance += amount;
        }

        public void setBalanceWithdrawal(double amount) {
            this.balance -= amount;
        }
        // Would want a transfer method as well to move money between accounts
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
