package com.accenture.tagtrainingspring.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;

@Component
public class ScreeningDatabase {
	
	// Properties
	List<Screening >screeningList = new ArrayList<Screening>();
	
	// Constructor
	public ScreeningDatabase() {
		
		
		Patient patient1 = new Patient();
		Screening screening1 = new Screening();

		// Populate the default instances with dummy data
		patient1.setName("Adam");
		patient1.setId(1111);
		patient1.setDateOfBirth( LocalDate.of(2000, 07, 05));
		patient1.setGender( Gender.MALE );
		
		screening1.setScreeningId(22);
		screening1.setPatientId(patient1);
		screening1.setDateOfScreening(LocalDate.of(2021, 07, 05));
		screening1.setMalignantResult(false);

		// Populate more dummy objects using parameterised constructor
		Patient patient2 = new Patient("Barry", 1112, LocalDate.of(2000, 12, 12), Gender.MALE);
		Screening screening2 = new Screening(23, patient2, LocalDate.of(2021, 07, 06), true);
		
		Patient patient3 = new Patient("Ciara", 1113, LocalDate.of(1999, 02, 27), Gender.FEMALE);
		Screening screening3 = new Screening(24, patient3, LocalDate.of(2021, 07, 06), false);
		
		// Add screenings to the screening list
		screeningList.add(screening1);
		screeningList.add(screening2);
		screeningList.add(screening3);

	}
	
	
	// Methods
	public List<Screening> listAllScreenings(){
		return screeningList;
	}

} // End class
