package com.xworkz.objects;

public class Speaker {
	String brand;
	String model;
	int price;
	int warranty;
	String color;
	int noOfSoundBoxes;
	int weight;
	String connectivityType;
	public void features() {
		System.out.println("brand "+brand+" model "+model+" price "+price+" warranty "+warranty+" color "+color+" sound boxes "+noOfSoundBoxes+" weight "+weight+" connectivity "+connectivityType);
	}
	
	public void playingSound() {
		System.out.println("we can play intrested music or sound");
	}
	public void bluetoothConnectivity() {
		System.out.println("connect speaker with bluetooth");
	}
	public void adjustingVloumes() {
		System.out.println("adjust volumes accordingly");
	}
	public void SwitchON() {
		System.out.println("sound on");
	}
	public void SwitchOFF() {
		System.out.println("sound off");
	}
	public void UsbConnectivity() {
		System.out.println("connect usb with speaker");
	}
	
}
