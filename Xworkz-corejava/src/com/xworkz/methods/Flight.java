package com.xworkz.methods;

public class Flight {
	String flightName;
	int ticketPrice;
	String color;
	int fuelCapacity;
	long weight;
	static int i=0;
	Flight farray[]=new Flight[3];
	
	public void takingoff() {
		System.out.println("flight has taken off");
	}
	public void landing() {
		System.out.println("flight has landed");
	}
	public void flying() {
		System.out.println("flight is in air");
	}
	public void addFlight(Flight f1) {
		
		farray[i]=f1;
		i=i+1;
	}

	public Flight(String flightName, int ticketPrice, String color, int fuelCapacity, long weight) {
		super();
		this.flightName = flightName;
		this.ticketPrice = ticketPrice;
		this.color = color;
		this.fuelCapacity = fuelCapacity;
		this.weight = weight;
	}
	public void displayFlightDetails() {
		for (int i = 0; i < farray.length; i++) {
		System.out.println("Flight name is "+farray[i].flightName);	
		System.out.println("Flight ticketcost is "+farray[i].ticketPrice);	
		System.out.println("Flight color is "+farray[i].color);	
		System.out.println("Fuelcapacity of flight is "+farray[i].fuelCapacity);	
		System.out.println("Flight weight is "+farray[i].weight);	
		}
	}
}
