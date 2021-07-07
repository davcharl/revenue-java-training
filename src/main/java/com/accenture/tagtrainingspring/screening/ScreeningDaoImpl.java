package com.accenture.tagtrainingspring.screening;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ScreeningDaoImpl implements ScreeningDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Screening getScreeningForPatientId(int patientId) {
		
		String sqlString = "SELECT * FROM screening_results WHERE id = ?";		
		Screening result = null;
		try {
			result = jdbcTemplate.queryForObject(sqlString, new Object[]{patientId}, new ScreeningRowMapper());
		} catch(EmptyResultDataAccessException ex) {
			// System.out.println("Exception caught in ScreeningDaoImpl getScreeningForPatientId\n" + ex.getMessage());
			log.info("Exception caught in ScreeningDaoImpl getScreeningForPatientId\n" + ex.getMessage());
		}
		return result;
	}

	@Override
	public List<Screening> getAllScreenings() {
		
		String sqlString = "SELECT * FROM screening_results";	
		List<Screening> result;
		result = jdbcTemplate.query(sqlString, new ScreeningRowMapper());
		
		return result;
	}

	@Override
	public void updateScreening(Screening screening) {
		
		int operationReturnValue;
		String sqlString = "INSERT INTO screening_results (Id, Diagnosis, Symmetry_Mean, Group_Id ) VALUES (?,?,?,?)";
		Object[] values = {screening.getId(), screening.getDiagnosis(), screening.getSymmetryMean(), screening.getGroupId() };
		operationReturnValue = jdbcTemplate.update(sqlString, values);
		System.out.println("operationReturnValue: " + operationReturnValue);
	}
	
	

}
