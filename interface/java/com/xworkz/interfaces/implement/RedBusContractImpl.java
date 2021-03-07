package com.xworkz.interfaces.implement;

import java.io.Serializable;

public class RedBusContractImpl implements RedBusContract,Serializable {
	
	public int maxBooking() {
		System.out.println("invoked maxbooking");
		return 1;
	}
	public void open() {
		System.out.println("invoked open");
	}
	public void close() {
		System.out.println("invoked close");
	}
	
}
