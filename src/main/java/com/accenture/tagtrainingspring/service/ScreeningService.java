package com.accenture.tagtrainingspring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;

@Service
public class ScreeningService {
	
	// Properties
	@Autowired
	ScreeningDatabase db;
	
	// Constructors
	public ScreeningService() {
		//db = new ScreeningDatabase();
	}
	public ScreeningService(ScreeningDatabase db) {
		this.db = db;
	}

	// Methods
	public Boolean matchScreeningToPatient(Screening screening, Patient patient) {
		
		boolean result = false;
		if(screening.getPatientId().getId() == patient.getId() ) {
			result = true;
		}
		return result;
	}
	
	public List<Screening> ListOfScreenings(){
		
		return db.listAllScreenings();
	}
	
	public Screening matchNameToScreening(String name) {
				
		// Check name
		if(name.isEmpty()) {
			System.out.println("No name entered! Please input a name and try again.");
			return null;
		}
		
		Optional<Screening> result;
		List<Screening> listOfScreenings = ListOfScreenings();
		
		result = listOfScreenings.stream().filter( x -> (x.getPatientId().getName().equalsIgnoreCase(name) ) ).findFirst();
		
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
		
		
		
		
		
		
		/*
		List<String> screeningNames = new ArrayList<>();
		List<Screening> listOfScreenings = ListOfScreenings();
		
		// Get list of screenings where name is supplied
		screeningNames = listOfScreenings.stream()
				.filter( x -> (x.getPatientId().getName() == name))
				.map(x -> x.getPatientId().getName())
				.collect(Collectors.toList())  ;
		
		return screeningNames;
		*/
		
		
	}

	
}
