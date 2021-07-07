package com.accenture.tagtrainingspring.screening;

import java.util.List;

public interface ScreeningDao {
	
	Screening getScreeningForPatientId(int patientId);
	
	List<Screening> getAllScreenings();
	
	void updateScreening(Screening screening);

}
