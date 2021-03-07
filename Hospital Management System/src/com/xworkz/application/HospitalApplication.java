package com.xworkz.application;

import java.util.Scanner;

import com.xworkz.hospital.Hospital;

public class HospitalApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner scan=new Scanner(System.in);
		
		Hospital hospital = new Hospital();
		hospital.setName("Baptist");
		hospital.setAddress("Hebbal");
		hospital.setHospitalId(10);
		hospital.setPhoneNumber(937497894);
		hospital.setTypeOfHospital("physical consultant");
		while (true) {
			System.out.println("1.Add patient");
			System.out.println("2.Display patient");
			System.out.println("3.Delete patient");
			System.out.println("4.Update patient");
			System.out.println("5.Exit");
			System.out.println("enter option");
			int option = in.nextInt();
			if (option == 1) {
				hospital.addPatient();
			}
			if (option == 2) {
				hospital.displayPatient();
			}
			
			if(option==3) {
				
				System.out.println("enter index");
				int index=scan.nextInt();
				hospital.deletePatient(index);
			}
			if(option==4) {
				
				System.out.println("enter index");
				int index=scan.nextInt();
				hospital.updatePatient(index);
			}
			if(option==5) {
				hospital.exit();
			}
			
		
		}

	}

}
