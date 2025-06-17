package com.portfolio.skill_service.service;

import java.util.List;

import com.portfolio.skill_service.dto.SkillDTO;

public interface SkillService {
    SkillDTO createSkill(SkillDTO skillDTO);
    List<SkillDTO> getAllSkills();
    SkillDTO getSkillById(Integer id);
    SkillDTO updateSkill(Integer id, SkillDTO skillDTO);
    void deleteSkill(Integer id);
}
