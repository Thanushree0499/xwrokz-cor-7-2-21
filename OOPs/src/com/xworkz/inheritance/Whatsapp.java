package com.xworkz.inheritance;

public class Whatsapp {
long phoneNumber;
private String name;
int noOfContacts;

public void chat() {
	System.out.println("invoked chat method");
}

public Whatsapp(long phoneNumber, String name, int noOfContacts) {
	super();
	this.phoneNumber = phoneNumber;
	this.name = name;
	this.noOfContacts = noOfContacts;
	System.out.println("details are  "+phoneNumber+name+noOfContacts);
}
public Whatsapp() {
	phoneNumber=-1;
	name=null;
	noOfContacts=-1;
	
	
	
}
}
