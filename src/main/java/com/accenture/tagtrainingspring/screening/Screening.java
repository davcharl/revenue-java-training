package com.accenture.tagtrainingspring.screening;

import java.time.LocalDate;

import com.accenture.tagtrainingspring.patient.Patient;

public class Screening {
	
	Integer screeningId;
	// Integer patientId;
	Patient patientId = new Patient();
	LocalDate dateOfScreening;
	Boolean malignantResult;
	
	// Constructors
	public Screening() {
		super();
	}
	public Screening(Integer screeningId, Patient patientId, LocalDate dateOfScreening, Boolean malignantResult) {
		super();
		this.screeningId = screeningId;
		this.patientId = patientId;
		this.dateOfScreening = dateOfScreening;
		this.malignantResult = malignantResult;
	}
	
	// Getters Setters
	public Integer getScreeningId() {
		return screeningId;
	}
	public void setScreeningId(Integer screeningId) {
		this.screeningId = screeningId;
	}
	public Patient getPatientId() {
		return patientId;
	}
	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}
	public LocalDate getDateOfScreening() {
		return dateOfScreening;
	}
	public void setDateOfScreening(LocalDate dateOfScreening) {
		this.dateOfScreening = dateOfScreening;
	}
	public Boolean getMalignantResult() {
		return malignantResult;
	}
	public void setMalignantResult(Boolean malignantResult) {
		this.malignantResult = malignantResult;
	}
	
	
	
	
	
	

}
