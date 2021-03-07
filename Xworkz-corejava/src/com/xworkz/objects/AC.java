package com.xworkz.objects;

public  class AC {
	String company;
	int price;
	String type;
	double capacity;
	static int warranty;
	String advanceFeatures;
	String color;
	int starRating;
	AC(){
		System.out.println("Air conditioner");
	}
	AC(String company){
	System.out.println("the company "+company);
	}
	public void acFeatures() {
		System.out.println(company+ " AC of price "+price+" which is of type "+type+" color "+color+" having capcity of "+capacity+" some of its advance features are "+advanceFeatures+" with "+warranty+" year warranty and which has "+starRating+" rating ");
	}
	public void cooling() {
		System.out.println("AC provides cooling effect");
		
	}
	public void temperatureSetting() {
		System.out.println("we can set temperature according to our needs");
	}
	public void dehumidifying() {
		System.out.println("ac used to provide warm temperature");
	}
	
}
