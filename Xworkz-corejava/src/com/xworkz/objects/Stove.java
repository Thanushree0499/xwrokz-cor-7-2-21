package com.xworkz.objects;

public class Stove {
	String brandName;
	int price;
	String model;
	int warranty;
	double weight;
	String color;
	String controlType;
	public void features() {
		System.out.println(brandName+" stove of price "+price+" model "+model+" color "+color+" warranty "+warranty+" of weight "+weight+" control type"+controlType);
	}
	public void switchON() {
		System.out.println("power button can be used to switch on stove");
	}
	public void switchOFF() {
		System.out.println("power button can be used to switch off stove");
	}
	public void cookingFood() {
		System.out.println("it cooks the food");
	}
	public void settingTimer() {
		System.out.println("set the time required for cooking");
	}
	public void whistlePreset() {
		System.out.println("set no of whistles while using pressure cooker");
	}
	
	
}
