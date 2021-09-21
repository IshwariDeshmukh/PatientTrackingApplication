package com.patientTracker.demo.Sevice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.patientTracker.demo.Entities.Doctor;
import com.patientTracker.demo.Services.AdminService;



@SpringBootTest
public class AdminServiceTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(AdminServiceTest.class);
	
	@Autowired
	private AdminService adminService;
	
	@Test
	public void testFindDoctorById() throws Exception{
		LOG.info("testDoctorById");
		Doctor expected = new Doctor(1,"Nayan","nayan@gmail.com","1234","MBBS");
		Doctor actual = adminService.getDoctorById(1);
		assertEquals(expected.getdId(), actual.getdId());
		
	}
	@Test
	public void testFindDoctorByIdNotFound() throws Exception{
		LOG.info("testNotDoctorById");
		Doctor unexpected = new Doctor(2,"Nayan","nayan@gmail.com","1234","MBBS");
		Doctor actual = adminService.getDoctorById(1);
		assertEquals(unexpected.getdId(), actual.getdId());
		
	}
	


}
