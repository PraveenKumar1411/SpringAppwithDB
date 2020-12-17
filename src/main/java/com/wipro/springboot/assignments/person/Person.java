package com.wipro.springboot.assignments.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String UID;
	

	@JsonProperty("firstName")
	private String firstName;
	
	@JsonProperty("LastName")
	private String LastName;
	
	@JsonProperty("Gender")
	private String Gender;
	
	@JsonProperty("DOB")
	private String DOB;
	
	@JsonProperty("Mobile")
	private String Mobile;
	
	@JsonProperty("Email")
	private String Email;
	
	
	public Person() {
		
	}
	
	
	public Person(String uID, String firstName, String lastName, String gender, String dOB, String mobile,
			String email) {
		super();
		UID = uID;
		this.firstName = firstName;
		LastName = lastName;
		Gender = gender;
		DOB = dOB;
		Mobile = mobile;
		Email = email;
	}



	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
