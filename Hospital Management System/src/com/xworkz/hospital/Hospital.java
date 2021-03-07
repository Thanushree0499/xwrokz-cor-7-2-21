package com.xworkz.hospital;

import java.util.Scanner;

import com.xworkz.patient.Patient;

public class Hospital {
	private String name;
	private String address;
	private int hospitalId;
	private long phoneNumber;
	private String typeOfHospital;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getTypeOfHospital() {
		return typeOfHospital;
	}
	public void setTypeOfHospital(String typeOfHospital) {
		this.typeOfHospital = typeOfHospital;
	}
	Scanner scan=new Scanner(System.in);
	Patient patientDetails[]=new Patient[10];
	int patientCount=0;
	public void addPatient() {
		Patient p=new Patient();
		System.out.println("enter the patient name");
		String name=scan.next();
		p.setName(name);
		System.out.println("enter the patient age");
		int age=scan.nextInt();
		p.setAge(age);
		System.out.println("enter the patient gender");
		String gender=scan.next();
		p.setGender(gender);
		System.out.println("enter the patient address");
		String address=scan.next();
		p.setAddress(address);
		System.out.println("enter the patient Id");
		int patientId=scan.nextInt();
		p.setPatientId(patientId);
		System.out.println("enter the patient disease");
		String diseaseName=scan.next();
		p.setDiseaseName(diseaseName);
		System.out.println("enter the consulting doctor name of patient");
		String consultingDoctorName=scan.next();
		p.setConsultingDoctorName(consultingDoctorName);
		patientDetails[patientCount]=p;
		patientCount=patientCount+1;
		
	}
	
	public void displayPatient() {
		for(int i=0;i<patientCount;i++) {
			if (patientDetails[i]!=null) {
				System.out.println("The patient name is "+patientDetails[i].getName());
				System.out.println("The patient age is "+patientDetails[i].getAge());
				System.out.println("The patient gender is "+patientDetails[i].getGender());
				System.out.println("The patient address is "+patientDetails[i].getAddress());
				System.out.println("The patient id is "+patientDetails[i].getPatientId());
				System.out.println("The patient disease is "+patientDetails[i].getDiseaseName());
				System.out.println("The patient consulting doctor is "+patientDetails[i].getConsultingDoctorName());		
			}
			
		}	
		}
	public void deletePatient(int index) {
		for (int i = 0; i < patientCount; i++) {
			if(index==i) {
				patientDetails[i]=null;
				
			}
		}
		
	}
	public void updatePatient(int index) {
		for (int i = 0; i < patientCount; i++) {
			if(i==index) {
				Patient p=patientDetails[i];
				System.out.println("enter the patient name");
				String name=scan.next();
				p.setName(name);
				System.out.println("enter the patient age");
				int age=scan.nextInt();
				p.setAge(age);
				System.out.println("enter the patient gender");
				String gender=scan.next();
				p.setGender(gender);
				System.out.println("enter the patient address");
				String address=scan.next();
				p.setAddress(address);
				System.out.println("enter the patient Id");
				int patientId=scan.nextInt();
				p.setPatientId(patientId);
				System.out.println("enter the patient disease");
				String diseaseName=scan.next();
				p.setDiseaseName(diseaseName);
				System.out.println("enter the consulting doctor name of patient");
				String consultingDoctorName=scan.next();
				p.setConsultingDoctorName(consultingDoctorName);
				patientDetails[i]=p;
		}
		
		}
	}
	public void exit() {
		System.exit(0);
	}
}

