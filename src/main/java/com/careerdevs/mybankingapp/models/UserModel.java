package com.careerdevs.mybankingapp.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

@Entity
@Table(name = "users")
//@CrossOrigin()        Remember to set a localhost so front end can interact with backend
public class UserModel {

    @Id
    private String userId;     // Allow users to create their own id when account is created

    private Contact contactInfo;
    public ArrayList<Optional> accounts;

    // Cliff's inclusion with school system. Idea bringing it over is one user may have multiple accounts
//    @OneToMany(mappedBy = "user", fetch= FetchType.LAZY)
//    @JsonIncludeProperties("name")
//    private Set<AccountModel> accounts;


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

    public String getUserId() {
        return userId;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void addAccount(Optional<SavingsModel> savings) {
        this.accounts.add(savings);
    }

    public void addCheckingAccount(Optional<CheckingModel> checking) {
        this.accounts.add(checking);
    }

    public ArrayList<Optional> getAccounts() {
        return accounts;
    }

}
