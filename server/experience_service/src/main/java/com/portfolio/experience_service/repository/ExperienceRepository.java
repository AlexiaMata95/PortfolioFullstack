package com.portfolio.experience_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.experience_service.entity.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {

}
