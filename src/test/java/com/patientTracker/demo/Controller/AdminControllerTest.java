package com.patientTracker.demo.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.patientTracker.demo.Entities.Doctor;

@SpringBootTest
public class AdminControllerTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(AdminControllerTest.class);
	
	
	@Autowired
	private AdminController adminController;
	
	public void testGetDoctorById() throws Exception{
		LOG.info("testGetDoctorById");
		
		HttpStatus expected = HttpStatus.OK;
		
		ResponseEntity<Doctor> actual = adminController.getDocById(1);
		assertEquals(expected, actual.getStatusCode());
	}

}
