package com.xworkz.doctor;

public class Doctor {
	private String name;
	private int doctorId;
	private int age;
	private long phoneNumber;
	private String specialisation;
	private int workingTimings;
	private int consultantFee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public int getWorkingTimings() {
		return workingTimings;
	}
	public void setWorkingTimings(int workingTimings) {
		this.workingTimings = workingTimings;
	}
	public int getConsultantFee() {
		return consultantFee;
	}
	public void setConsultantFee(int consultantFee) {
		this.consultantFee = consultantFee;
	}
	
}
