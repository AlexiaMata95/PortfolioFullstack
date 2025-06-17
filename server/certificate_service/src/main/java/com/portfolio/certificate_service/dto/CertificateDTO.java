package com.portfolio.certificate_service.dto;

import java.util.List;

public class CertificateDTO {
    private Integer id;
    private String name;
    private String issuer;
    private Integer year;
    private List<Integer> categoryIds;
    private List<String> categoryNames;

    public CertificateDTO(){}

    public CertificateDTO(Integer id, String name, String issuer, Integer year, List<Integer> categoryIds, List<String> categoryNames) {
        this.id = id;
        this.name = name;
        this.issuer = issuer;
        this.year = year;
        this.categoryIds = categoryIds;
        this.categoryNames = categoryNames;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    };

    public List<Integer> getCategoryIds() { return categoryIds; }
    public void setCategoryIds(List<Integer> categoryIds) { this.categoryIds = categoryIds; }

    public List<String> getCategoryNames() { return categoryNames; }
    public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames; }

    
}
