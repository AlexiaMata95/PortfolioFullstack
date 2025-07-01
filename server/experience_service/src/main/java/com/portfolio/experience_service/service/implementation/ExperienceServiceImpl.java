package com.portfolio.experience_service.service.implementation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.experience_service.dto.ExperienceDTO;
import com.portfolio.experience_service.entity.Experience;
import com.portfolio.experience_service.repository.ExperienceRepository;
import com.portfolio.experience_service.service.ExperienceService;

@Service
public class ExperienceServiceImpl implements ExperienceService {

	@Autowired
	private ExperienceRepository experienceRepository;

	private Experience dtoToEntity(ExperienceDTO dto) {
		Experience experience = new Experience();
		experience.setCompany(dto.getCompany());
		experience.setPosition(dto.getPosition());
		experience.setFunctions(dto.getFunctions());
		experience.setDate(dto.getDate());
		return experience;
	}

	private ExperienceDTO entityToDto(Experience experience) {
		return new ExperienceDTO(
			experience.getId(),
			experience.getCompany(),
			experience.getPosition(),
			experience.getDate(),
			experience.getFunctions()
		);
	}

	@Override
	public ExperienceDTO createExperience(ExperienceDTO experienceDTO) {
		Experience saved = experienceRepository.save(dtoToEntity(experienceDTO));
		return entityToDto(saved);
	}

	@Override
	public List<ExperienceDTO> getAllExperiences() {
		return experienceRepository.findAll()
				.stream()
				.map(this::entityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public ExperienceDTO getExperienceById(Integer id) {
		Optional<Experience> experience = experienceRepository.findById(id);
		return experience.map(this::entityToDto).orElse(null);
	}

	@Override
	public ExperienceDTO updateExperience(Integer id, ExperienceDTO experienceDTO) {
		Optional<Experience> optional = experienceRepository.findById(id);
		if (optional.isPresent()) {
			Experience exp = optional.get();
			exp.setCompany(experienceDTO.getCompany());
			exp.setPosition(experienceDTO.getPosition());
			exp.setDate(experienceDTO.getDate());
			exp.setFunctions(experienceDTO.getFunctions());
			Experience updated = experienceRepository.save(exp);
			return entityToDto(updated);
		}
		return null;
	}

	@Override
	public void deleteExperience(Integer id) {
		experienceRepository.deleteById(id);
	}
}

