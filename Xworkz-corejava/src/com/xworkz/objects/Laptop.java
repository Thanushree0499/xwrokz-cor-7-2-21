package com.xworkz.objects;

public class Laptop {
	String brand;
	int price;
	double camera;
	int batteryCapacity;
	int memory;
	String series;
	int generation;
	String OS;
	public void details() {
		System.out.println("brand "+brand+  " price "+price+  " camera "+camera+  " battery "+batteryCapacity+  " memory "+memory+  " series "+series+  " generation "+generation+  " operatingsystem"+OS);
	}
	public void gaming() {
		System.out.println("laptop" +brand+ " can be used for playing games");
	}
	public void painting() {
		System.out.println("draw and paint pictures");
	}
	public void music() {
		System.out.println("listen to music");
	}
	public void movies() {
		System.out.println("we can watch movies");
	}
}
