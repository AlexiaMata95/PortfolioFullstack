
package com.portfolio.skill_service.repository;

import com.portfolio.skill_service.entity.Skill;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
	List<Skill> findByCategories_Name(String name);
}