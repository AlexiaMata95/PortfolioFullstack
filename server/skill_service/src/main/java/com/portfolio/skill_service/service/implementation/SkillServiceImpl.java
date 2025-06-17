package com.portfolio.skill_service.service.implementation;

import com.portfolio.skill_service.dto.SkillDTO;
import com.portfolio.skill_service.entity.Category;
import com.portfolio.skill_service.entity.Skill;
import com.portfolio.skill_service.repository.CategoryRepository;
import com.portfolio.skill_service.repository.SkillRepository;
import com.portfolio.skill_service.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    private Skill dtoToEntity(SkillDTO dto) {
        Skill skill = new Skill();
        skill.setName(dto.getName());
        skill.setLevel(dto.getLevel());
        Set<Category> categories = categoryRepository.findAllById(dto.getCategoryIds()).stream().collect(Collectors.toSet());
        skill.setCategories(categories);
        return skill;
    }

    private SkillDTO entityToDto(Skill skill) {
        List<Integer> ids = skill.getCategories().stream().map(Category::getId).collect(Collectors.toList());
        List<String> names = skill.getCategories().stream().map(Category::getName).collect(Collectors.toList());
        return new SkillDTO(skill.getId(), skill.getName(), skill.getLevel(), ids, names);
    }

    @Override
    public SkillDTO createSkill(SkillDTO skillDTO) {
        Skill saved = skillRepository.save(dtoToEntity(skillDTO));
        return entityToDto(saved);
    }

    @Override
    public List<SkillDTO> getAllSkills() {
        return skillRepository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    public SkillDTO getSkillById(Integer id) {
        Skill skill = skillRepository.findById(id).orElseThrow(() -> new RuntimeException("Skill not found"));
        return entityToDto(skill);
    }

    @Override
    public SkillDTO updateSkill(Integer id, SkillDTO skillDTO) {
        Skill skill = skillRepository.findById(id).orElseThrow(() -> new RuntimeException("Skill not found"));
        skill.setName(skillDTO.getName());
        skill.setLevel(skillDTO.getLevel());
        Set<Category> categories = categoryRepository.findAllById(skillDTO.getCategoryIds()).stream().collect(Collectors.toSet());
        skill.setCategories(categories);
        Skill updated = skillRepository.save(skill);
        return entityToDto(updated);
    }

    @Override
    public void deleteSkill(Integer id) {
        skillRepository.deleteById(id);
    }
}