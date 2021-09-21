/**
 * 
 */
package com.patientTracker.demo.Entities;

import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author user
 *
 */
//@Component("admin")
//@Scope(scopeName = "prototype")
@Entity
@Table(name = "PATIENT_TABLE")
public class Patient {

	@Id
	@Column(name = "P_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;

	@Column(name = "P_NAME", length = 20, nullable = false)
	private String pName;

	@Column(name = "P_GENDER", length = 10, nullable = false)
	private String gender;

	@Column(name = "P_AGE", nullable = false)
	private int age;

	@Column(name = "P_CONTACT", length = 20, nullable = false)
	private String contact;//long datatype

	@Column(name = "P_ADDRESS")
	private String address;

	@OneToMany
	@JoinColumn(name = "tId")
	private List<TreatmentHistory> treatmentHistory;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int pId, String pName, String gender, int age, String contact) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.gender = gender;
		this.age = age;
		this.contact = contact;

	}

	public Patient(int pId, String pName, String gender, int age, String contact, String address,
			List<TreatmentHistory> treatmentHistory) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.gender = gender;
		this.age = age;
		this.contact = contact;
		this.address = address;
		this.treatmentHistory = treatmentHistory;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<TreatmentHistory> getTreatmentHistory() {
		return treatmentHistory;
	}

	public void setTreatmentHistory(List<TreatmentHistory> treatmentHistory) {
		this.treatmentHistory = treatmentHistory;
	}

	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", pName=" + pName + ", gender=" + gender + ", age=" + age + ", contact="
				+ contact + ", address=" + address + ", treatmentHistory=" + treatmentHistory + "]";
	}

	// gender, contact,age,address,id,name

//	@OneToMany
//	@JoinColumn(name = "Doctor")
//	private Doctor doctor;
//private List<TreatmentHistory> treatmentHistory;
	// class patient{
	// @OneToMany
//		@JoinColumn(name = "treatmentId")
	// private List<TreatmentHistory> treatmentHistory;
	// }
	// class TreatmentHistory{
	// @ManytoOne
//		@JoinColumn(name = "patientId")
	// Patient patient;

	// @ManytoOne
//		@JoinColumn(name = "doctorId")
	// Doctor doctor;
	// }

	// class Doctor{
	// @OneToMany
//		@JoinColumn(name = "treatmentId")
	// private List<TreatmentHistory> treatmentHistory;
	// }

}
