package com.xworkz.methods;

public class Flying {

	public static void main(String[] args) {
		Flight f1=new Flight("Air India",5000,"white",18000,80000);
		Flight f2=new Flight("Deccan AirWays",3000,"white",20000,80000);
		Flight f3=new Flight("Emirates",10000,"white",15000,70000);
		
		f1.addFlight(f1);
		f2.addFlight(f2);
		f3.addFlight(f3);
		f1.displayFlightDetails();
		f2.displayFlightDetails();
		f3.displayFlightDetails();
		
	}

}
