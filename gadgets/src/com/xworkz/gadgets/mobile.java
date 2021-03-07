package com.xworkz.gadgets;

public class mobile implements usbcable {

	@Override
	public void connect() {
		System.out.println("connected");
		
	}

	@Override
	public void transferFiles() {
		System.out.println("file transferred");
	}
	
	public void calling() {
		System.out.println("called");
	}

}
