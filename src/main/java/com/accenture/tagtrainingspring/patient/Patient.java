package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

public class Patient {
	
	// Class properties
	String name;
	Integer id;
	LocalDate dateOfBirth;
	Gender gender;
	
	// Constructors
	public Patient() {
		
	}
	public Patient(String name, Integer id, LocalDate dateOfBirth, Gender gender) {
		super();
		this.name = name;
		this.id = id;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}
	
	// Getters Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	

}
