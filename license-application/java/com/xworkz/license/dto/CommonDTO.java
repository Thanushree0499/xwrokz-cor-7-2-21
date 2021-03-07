package com.xworkz.license.dto;

import java.sql.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;

public class CommonDTO {
	private String name;
	private int age;
	private Date dob;
	private long mobileNumber;
	private AddressDTO addressDTO;
	private Gender gender;
	private BloodGroup bloodGroup;
	
	public CommonDTO() {
		
	}

	public CommonDTO(String name, int age, Date dob, long mobileNumber, AddressDTO addressDTO, Gender gender,
			BloodGroup bloodGroup) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.mobileNumber = mobileNumber;
		this.addressDTO = addressDTO;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	

	
	
}
