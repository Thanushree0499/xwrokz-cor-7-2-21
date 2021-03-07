package com.xworkz.oops.contract;

import java.io.Serializable;

public interface RedbusContract extends Serializable {
	public  int i=10;
	 int minBooking();

	public boolean busWarranty();
	
	public static int accept() {
		System.out.println("hh");
		return 1;
	}
	
   
	
}
