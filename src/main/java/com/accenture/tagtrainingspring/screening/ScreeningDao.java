package com.accenture.tagtrainingspring.screening;

import java.util.List;

public interface ScreeningDao {
	
	Screening GetScreeningForPatientId(int patientId);
	
	List<Screening> GetAllScreenings();

}
