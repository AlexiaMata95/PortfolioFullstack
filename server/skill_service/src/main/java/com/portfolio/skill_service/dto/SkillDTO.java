package com.portfolio.skill_service.dto;

import java.util.List;

public class SkillDTO {
    private Integer id;
    private String name;
    private String level;
    private List<Integer> categoryIds;
    private List<String> categoryNames;

    public SkillDTO() {}

    public SkillDTO(Integer id, String name, String level, List<Integer> categoryIds, List<String> categoryNames) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.categoryIds = categoryIds;
        this.categoryNames = categoryNames;
    }

    public Integer getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }

    public List<Integer> getCategoryIds() { return categoryIds; }
    public void setCategoryIds(List<Integer> categoryIds) { this.categoryIds = categoryIds; }

    public List<String> getCategoryNames() { return categoryNames; }
    public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames; }
}
