package com.careerdevs.mybankingapp.repositories;


import com.careerdevs.mybankingapp.models.CheckingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckingRepository extends JpaRepository<CheckingModel, Integer> {
}
