package com.careerdevs.mybankingapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "checking")
public class CheckingModel {

    @Id
    private int accountNumber;

    private double balance;
    private double transactionFee;
    private String accountHolder;
    private Contact contactInfo;

    public static class Contact {
        private String phone;
        private String address;
        private String beneficiary;

        public String getPhone() {
            return phone;
        }

        public String getAddress() {
            return address;
        }

        public String getBeneficiary() {
            return beneficiary;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setBeneficiary(String beneficiary) {
            this.beneficiary = beneficiary;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }
}
