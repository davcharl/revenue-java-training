package com.accenture.tagtrainingspring.screening;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.tagtrainingspring.service.ScreeningService;

@RestController
public class ScreeningController {
	
	// properties
	@Autowired
	ScreeningDaoImpl screeningDaoImpl;
	//ScreeningService screeningService;
	
	// Constructors
	
	// Methods
	@GetMapping("/screenings")
	public List<Screening> getScreenings(){
		
		return screeningDaoImpl.GetAllScreenings();
	}
	
	@GetMapping("/screening/{id}")
	public Screening getScreening(@PathVariable int id) {
		
		return screeningDaoImpl.GetScreeningForPatientId(id);
	}
	
	

}
