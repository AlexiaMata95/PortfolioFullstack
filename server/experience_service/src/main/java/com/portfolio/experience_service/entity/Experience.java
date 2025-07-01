package com.portfolio.experience_service.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="experience")
public class Experience {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String company;
	
	@Column(nullable = false)
	private String position;
	
	@Column(nullable = false)
	private String date;
	
	@ElementCollection
	@CollectionTable(name = "experience_functions", joinColumns = @JoinColumn(name = "experience_id"))
	@Column(name = "function", nullable = false)
	private List<String> functions = new ArrayList<>();

	public Experience() {}

	public Integer getId() { return id; }

	public String getCompany() { return company; }

	public void setCompany(String company) { this.company = company; }

	public String getPosition() { return position; }

	public void setPosition(String position) { this.position = position; }

	public String getDate() { return date; }

	public void setDate(String date) { this.date = date; }

	public List<String> getFunctions() { return functions; }

	public void setFunctions(List<String> functions) { this.functions = functions; }

	public void addFunction(String function) {
		this.functions.add(function);
	}
}

