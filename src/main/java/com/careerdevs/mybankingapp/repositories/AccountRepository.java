package com.careerdevs.mybankingapp.repositories;


import com.careerdevs.mybankingapp.models.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountModel, Integer> {
}
