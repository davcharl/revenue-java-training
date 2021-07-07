package com.accenture.tagtrainingspring;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.service.ScreeningDatabase;
import com.accenture.tagtrainingspring.service.ScreeningService;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		
		
//		printWelcomeMessage();
//		
//		// Properties
//		String name;
//		List<Screening> screeningList;
//		
//		// Instantiate a screening service with a db
//		ScreeningDatabase db = new ScreeningDatabase();	
//		ScreeningService screeningService = new ScreeningService(db);
//		
//		// Retrieve list of screenings from the screening service
//		screeningList = screeningService.ListOfScreenings();
//		
//		/*
//		
//		System.out.println("Patient: " + screening1.getPatientId().getName() + 
//				" has a malignant diagnosis of " + screening1.getMalignantResult() );
//		
//		System.out.println("Screening " + screening1.getScreeningId() + 
//							": has a match of " + patientMatchesScreening + 
//							" with patient: " + patient1.getName());
//		
//		*/
//		
//		/*
//		ScreeningService screeningService = new ScreeningService();
//		patientMatchesScreening = screeningService.matchScreeningToPatient(screening1, patient1);
//		*/
//		 
//		
//		screeningList.stream().forEach(
//				x -> System.out.println(
//						"Patient " + x.getPatientId().getName() + " " + (x.getMalignantResult() ? "has " : "has not ") + "malignancy"  ) );
//		
//		
//		name = "Fred";
//		try {
//			Screening result = screeningService.matchNameToScreening(name);
//			System.out.println(result.getScreeningId());
//		} catch(Exception ex) {
//			System.out.println("No screening results for _" + name + "_");
//		}
		

		

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
	
	
	
	
	
	

}
