package com.xworkz.gadgets;

public class GadgetTester {

	public static void main(String[] args) {
		
		usbcable usbcable=new PowerBank();
		usbcable.connect();
		usbcable.transferFiles();
		
		PowerBank powerBank=new PowerBank();
		powerBank.connect();
		powerBank.transferFiles();
		powerBank.charge();
		powerBank.discharge();
		
		
	
	}

}
