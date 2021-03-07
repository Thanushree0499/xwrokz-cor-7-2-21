package com.xworkz.gadgets;

public class PowerBank implements usbcable {

	@Override
	public void connect() {
		System.out.println("connected");
		
	}

	@Override
	public void transferFiles() {
		System.out.println("file transferred");
		
	}
	
	public void charge() {
		System.out.println("charging");
	}
	
	public void discharge() {
		System.out.println("discharging");
	}
}
