package com.careerdevs.mybankingapp.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    private int userId;     // Allow users to create their own id when account is created

    private Contact contactInfo;

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

    public Contact getContactInfo() {
        return contactInfo;
    }
}
