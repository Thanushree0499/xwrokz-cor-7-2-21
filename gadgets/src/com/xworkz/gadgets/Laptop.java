package com.xworkz.gadgets;

public class Laptop implements usbcable {

	@Override
	public void connect() {
		System.out.println("connected");
		
	}

	@Override
	public void transferFiles() {
		System.out.println("file transferred");
	}

	public void shutdown() {
		System.out.println("shutting down");
	}
}
