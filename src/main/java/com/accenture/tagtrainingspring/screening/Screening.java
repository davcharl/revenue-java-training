package com.accenture.tagtrainingspring.screening;

import java.time.LocalDate;

import com.accenture.tagtrainingspring.patient.Patient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Screening {
	
	
	private int id;

	private char diagnosis;

	private double radiusMean;

	private double textureMean;

	private double perimeterMean;

	private double areaMean;

	private double smoothnessMean;

	private double compactnessMean;

	private double concavityMean;

	private double concavePointsMean;

	private double symmetryMean;

	private double fractalDimensionMean;

	private double radiusSe;

	private double textureSe;

	private double perimeterSe;

	private double areaSe;

	private double smoothnessSe;

	private double compactnessSe;

	private double concavitySe;

	private double concavePointsSe;

	private double symmetrySe;

	private double fractalDimensionSe;

	private double radiusWorst;

	private double textureWorst;

	private double perimeterWorst;

	private double areaWorst;

	private double smoothnessWorst;

	private double compactnessWorst;

	private double concavityWorst;

	private double concavePointsWorst;

	private double symmetryWorst;

	private double fractalDimensionWorst;

	private char groupId;
	
	
	
	
	/*
	
	Integer screeningId;
	// Integer patientId;
	Patient patientId = new Patient();
	LocalDate dateOfScreening;
	Boolean malignantResult;
	
	// Constructors
	public Screening() {
	}
	public Screening(Integer screeningId, Patient patientId, LocalDate dateOfScreening, Boolean malignantResult) {
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
	
	
	*/
	
	
	

}
