package com.careerdevs.mybankingapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountModel {

    @Id
    private String accountNumber;

    public class CheckingAcct {
        private double balance;
        private double transactionFee;
        private String accountHolder;
        private Contact contactInfo;

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

    }

    public class SavingsAcct {
        private double balance;
        private String accountHolder;
        private Contact contactInfo;

        public double getBalance() {
            return balance;
        }
        public String getAccountHolder() {
            return accountHolder;
        }
        public Contact getContactInfo() {
            return contactInfo;
        }

    }

//    private Contact contactInfo;  Wonder if I have to move the constructor class inside each class to function properly

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

    public String getAccountNumber() {
        return accountNumber;
    }

}
