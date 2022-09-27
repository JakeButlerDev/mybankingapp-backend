package com.careerdevs.mybankingapp.repositories;


import com.careerdevs.mybankingapp.models.CheckingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<CheckingModel, Integer> {
    CheckingModel findOneByUuid(UUID uuid);
}
