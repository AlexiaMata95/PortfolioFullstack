package com.portfolio.experience_service.service;

import java.util.List;

import com.portfolio.experience_service.dto.ExperienceDTO;

public interface ExperienceService {
    ExperienceDTO createExperience(ExperienceDTO experienceDTO);
    List<ExperienceDTO> getAllExperiences();
    ExperienceDTO getExperienceById(Integer id);
    ExperienceDTO updateExperience(Integer id, ExperienceDTO experienceDTO);
    void deleteExperience(Integer id);
}
