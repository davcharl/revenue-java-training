package com.accenture.tagtrainingspring.service;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;

public class ScreeningService {
	
	// Properties
	// Constructors
	public ScreeningService() {
		super();
	}

	// Methods
	public Boolean matchScreeningToPatient(Screening screening, Patient patient) {
		
		boolean result = false;
		if(screening.getPatientId().getId() == patient.getId() ) {
			result = true;
		}
		return result;
	}

	
}
