package com.portfolio.education_service.dto;


public class DiplomaDTO {
    private Integer id;
    private String name;
    private String issuer;
    private Integer year;

    public DiplomaDTO() {}

    public DiplomaDTO(Integer id, String name, String issuer, Integer year) {
        this.id = id;
        this.name = name;
        this.issuer = issuer;
        this.year = year;
    }

    public Integer getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIssuer() { return issuer; }
    public void setIssuer(String issuer) { this.issuer = issuer; }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
