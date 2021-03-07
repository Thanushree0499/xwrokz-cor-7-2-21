package com.xworkz.objects;

public class Speakers {

	public static void main(String[] args) {
		Speaker s1=new Speaker();
		s1.brand="JBL";
		s1.color="black";
		s1.connectivityType="bluetooth";
		s1.model="TG58787";
		s1.price=2000;
		s1.warranty=1;
		s1.weight=200;
		s1.noOfSoundBoxes=1;
		s1.features();
		s1.bluetoothConnectivity();
		s1.adjustingVloumes();
		s1.SwitchON();
		s1.SwitchOFF();
		s1.playingSound();
		s1.UsbConnectivity();
		
		Speaker s2=new Speaker();
		s2.brand="Sony";
		s2.color="red";
		s2.connectivityType="bluetooth and usb";
		s2.model="FHG787";
		s2.price=5700;
		s2.warranty=2;
		s2.weight=200;
		s2.noOfSoundBoxes=4;
		s2.features();
		s2.bluetoothConnectivity();
		s2.adjustingVloumes();
		s2.SwitchON();
		s2.SwitchOFF();
		s2.playingSound();
		s2.UsbConnectivity();
		
		Speaker s3=new Speaker();
		s3.brand="Philips";
		s3.color="black";
		s3.connectivityType="bluetooth and usb";
		s3.model="TGG65787";
		s3.price=6000;
		s3.warranty=2;
		s3.weight=200;
		s3.noOfSoundBoxes=1;
		s3.features();
		s3.bluetoothConnectivity();
		s3.adjustingVloumes();
		s3.SwitchON();
		s3.SwitchOFF();
		s3.playingSound();
		s3.UsbConnectivity();
	}

}
