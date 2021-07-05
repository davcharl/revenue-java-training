package com.accenture.tagtrainingspring;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;





@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();
		
		Patient patient = new Patient();
		Screening screening = new Screening();
		
		// Populate the default instances with dummy data
		patient.setName("Adam");
		patient.setId(1111);
		patient.setDateOfBirth( LocalDate.of(2000, 07, 05));
		patient.setGender( Gender.MALE );
		
		screening.setScreeningId(22);
		screening.setPatientId(patient);
		screening.setDateOfScreening(LocalDate.of(2021, 07, 05));
		screening.setMalignantResult(false);
		
		/*
		System.out.println(patient.getName() + " is " + patient.getGender());
		System.out.println("Screening patient " + 
							screening.getPatientId() +
							(screening.getMalignantResult()
									?" has cancer":" doesnt have cancer") );
		*/
		
		System.out.println("Patient: " + screening.getPatientId().getName() + 
				" has a malignant diagnosis of " + screening.getMalignantResult() );
		
		// Change patient name
		patient.setName("Barry");
		
		// Ensure it's still working with a console print
		System.out.println("Patient: " + screening.getPatientId().getName() + 
				" has a malignant diagnosis of " + screening.getMalignantResult() );
	}

	private static void printWelcomeMessage() {
		System.out.println("\n" +
				"  _______       _____   _______        _       _             \n" +
				" |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
				"    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
				"    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
				"    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
				"    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
				"                                                        __/ |\n" +
				"                                                       |___/ \n");
	}
	
	// Creating default instances of Patient and Diagnosis
	
	
	
	

}
