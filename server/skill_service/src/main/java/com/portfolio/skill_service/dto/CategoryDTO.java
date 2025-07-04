package com.portfolio.skill_service.dto;

public class CategoryDTO {
    private Integer id;
    private String name;

    public CategoryDTO() {}
    public CategoryDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() { return id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
