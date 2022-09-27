package com.careerdevs.mybankingapp.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "checkingaccounts")
//@CrossOrigin()        Remember to set a localhost so front end can interact with backend
public class CheckingModel {

    @Id
    @GeneratedValue
    @Type(type="org.hibernate.type.UUIDCharType")
    public UUID id;
    // Use UUID as generation method, when account is first created


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




    public UUID getId() {
        return id;
    }


}
