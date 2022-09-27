package com.careerdevs.mybankingapp.models;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "savingsaccounts")
//@CrossOrigin()        Remember to set a localhost so front end can interact with backend
public class SavingsModel {

    @Id
    @GeneratedValue
    @Type(type="org.hibernate.type.UUIDCharType")
    public UUID id;

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

    public UUID getId() {
        return id;
    }
}
