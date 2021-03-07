package com.xworkz.objects;

public class Laptopdetails {

	public static void main(String[] args) {
		Laptop lap1=new Laptop();
		lap1.brand="dell";
		lap1.price=40000;
		lap1.batteryCapacity=4200;
		lap1.camera=0.92;
		lap1.generation=10;
		lap1.memory=526;
		lap1.OS="windows10";
		lap1.series="inspiron 14 3000";
		lap1.details();
		lap1.gaming();
		lap1.movies();
		lap1.music();
		lap1.painting();
		Laptop lap2=new Laptop();
		lap2.brand="HP";
		lap2.price=50000;
		lap2.batteryCapacity=5000;
		lap2.camera=0.92;
		lap2.generation=8;
		lap2.memory=256;
		lap2.OS="windows10";
		lap2.series="Hp pavilion";
		lap2.details();
		lap2.gaming();
		lap2.movies();
		lap2.music();
		lap2.painting();
		Laptop lap3=new Laptop();
		lap3.brand="lenovo";
		lap3.price=45000;
		lap3.batteryCapacity=3000;
		lap3.camera=0.92;
		lap3.generation=10;
		lap3.memory=256;
		lap3.OS="windows10";
		lap3.series="lenovo thinkpad";
		lap3.details();
		lap3.gaming();
		lap3.movies();
		lap3.music();
		lap3.painting();
		

	}

}
