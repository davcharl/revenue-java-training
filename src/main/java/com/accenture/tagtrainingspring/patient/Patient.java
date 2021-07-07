package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {
	
	// Class properties
	String name;
	Integer id;
	LocalDate dateOfBirth;
	Gender gender;
	
	


}
