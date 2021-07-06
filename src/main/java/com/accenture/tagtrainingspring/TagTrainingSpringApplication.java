package com.accenture.tagtrainingspring;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.service.ScreeningService;





@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();
		
		boolean patientMatchesScreening;
		List<Screening> screeningList = new ArrayList<Screening>();
		
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
		
		screeningList.add(screening1);
		screeningList.add(screening2);
		screeningList.add(screening3);
		
		ScreeningService screeningService = new ScreeningService();
		patientMatchesScreening = screeningService.matchScreeningToPatient(screening1, patient1);
		
		System.out.println("Patient: " + screening1.getPatientId().getName() + 
				" has a malignant diagnosis of " + screening1.getMalignantResult() );
		
		System.out.println("Screening " + screening1.getScreeningId() + 
							": has a match of " + patientMatchesScreening + 
							" with patient: " + patient1.getName());
		
		screeningList.stream().forEach(
				x -> System.out.println(
						"Patient " + x.getPatientId().getName() + " " + (x.getMalignantResult() ? "has " : "has not ") + "malignancy"  ) );

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
