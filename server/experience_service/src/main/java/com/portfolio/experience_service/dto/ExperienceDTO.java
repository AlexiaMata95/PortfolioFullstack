package com.portfolio.experience_service.dto;

import java.util.List;

public class ExperienceDTO {
	private Integer id;
	private String company;
	private String position;
	private String date;
	private List<String> functions;

	public ExperienceDTO() {}

	public ExperienceDTO(Integer id, String company, String position, String date, List<String> functions) {
		this.id = id;
		this.company = company;
		this.position = position;
		this.date = date;
		this.functions = functions;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<String> getFunctions() {
		return functions;
	}

	public void setFunctions(List<String> functions) {
		this.functions = functions;
	}
}

