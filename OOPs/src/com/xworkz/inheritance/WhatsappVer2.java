package com.xworkz.inheritance;

public class WhatsappVer2 extends Whatsapp{
	int dob;
	
	public void setDp() {
		System.out.println("invoked set dp method");
	}

	public WhatsappVer2(long phoneNumber, String name, int noOfContacts, int dob) {
		super();
		
		this.dob = dob;
		System.out.println("details are  "+phoneNumber+name+noOfContacts+dob);
	}

}
