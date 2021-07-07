package com.accenture.tagtrainingspring.screening;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ScreeningDaoImpl implements ScreeningDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Screening GetScreeningForPatientId(int patientId) {
		// TODO Auto-generated method stub
		String sqlString = "SELECT * FROM screening_results WHERE id = ?";
		System.out.println(sqlString); // For debugging purposes only
		
		Screening result;
		result = jdbcTemplate.queryForObject(sqlString, new Object[]{patientId}, new ScreeningRowMapper());
		
		return result;
	}

	@Override
	public List<Screening> GetAllScreenings() {
		
		String sqlString = "SELECT * FROM screening_results";	
		List<Screening> result;
		result = jdbcTemplate.query(sqlString, new ScreeningRowMapper());
		
		return result;
	}

}
