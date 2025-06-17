package com.portfolio.skill_service.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.portfolio.skill_service.dto.CategoryDTO;
import com.portfolio.skill_service.entity.Category;
import com.portfolio.skill_service.repository.CategoryRepository;
import com.portfolio.skill_service.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
     @Autowired
    private CategoryRepository categoryRepository;

    private Category dtoToEntity(CategoryDTO dto) {
        Category category = new Category();
        category.setName(dto.getName());
        return category;
    }

    private CategoryDTO entityToDto(Category category) {
        return new CategoryDTO(category.getId(), category.getName());
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category saved = categoryRepository.save(dtoToEntity(categoryDTO));
        return entityToDto(saved);
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryById(Integer id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
        return entityToDto(category);
    }

    @Override
    public CategoryDTO updateCategory(Integer id, CategoryDTO categoryDTO) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
        category.setName(categoryDTO.getName());
        Category updated = categoryRepository.save(category);
        return entityToDto(updated);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }
}
