package com.careerdevs.mybankingapp.repositories;

import com.careerdevs.mybankingapp.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
        Optional<UserModel> findByUserId(String userId);
}
