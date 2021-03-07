package com.xworkz.objects;

public class headphone {
	char brand;
	int price;
	char color;
	String brandSeries;
	String batteryLife;
	String assistantSupport;
	float bluetoothVersion;
	int warranty;
	public void headphoneFeatures() {
		System.out.println("headphone "+brand+ " price "+price+" color "+color+" brandseries "+brandSeries+" batterLife "+batteryLife+" assistansupport "+assistantSupport+" bluetoothversion "+bluetoothVersion+" warranty "+warranty);
	}
	public void music() {
		System.out.println("enjoy listening to music");
	}
	public void recording() {
		System.out.println("used in sound recordings");
	}
}
