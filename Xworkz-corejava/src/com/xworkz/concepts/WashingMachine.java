package com.xworkz.concepts;

public class WashingMachine {
	String brand;
	int price;
	int warranty;
	int weight;
	boolean childlock;
	int timer;

	public WashingMachine(String brand, int price, int warranty, int weight, boolean childlock, int timer) {
		this.brand = brand;
		this.price = price;
		this.warranty = warranty;
		this.weight = weight;
		this.childlock = childlock;
		this.timer = timer;
	}
	public void washing() {
		System.out.println("washing is done");
	}
	public String setTimer() {
		if(timer==10) {
			
			System.out.println("washing is done");
		}
		return "not perfect wash";
	}
	public void childlock() {
		
		System.out.println("childlock is on");
	}
	
}