package com.xworkz.objects;

public class currentStove {

	public static void main(String[] args) {
		Stove stove1=new Stove();
		stove1.brandName="Prestige";
		stove1.model="prestige v3 induction";
		stove1.color="black";
		stove1.controlType="touch";
		stove1.weight=1.5;
		stove1.price=4000;
		stove1.warranty=1;
		stove1.features();
		stove1.cookingFood();
		stove1.switchON();
		stove1.switchOFF();
		stove1.whistlePreset();
		stove1.settingTimer();
		Stove stove2=new Stove();
		stove2.brandName="Pegion";
		stove2.model="pegion v3 induction";
		stove2.color="black";
		stove2.controlType="touch";
		stove2.weight=1.5;
		stove2.price=4500;
		stove2.warranty=1;
		stove2.features();
		stove2.cookingFood();
		stove2.switchON();
		stove2.switchOFF();
		stove2.whistlePreset();
		stove2.settingTimer();
		Stove stove3=new Stove();
		stove3.brandName="Usha";
		stove3.model="Usha cook joy";
		stove3.color="black";
		stove3.controlType="touch";
		stove3.weight=1.5;
		stove3.price=3000;
		stove3.warranty=1;
		stove3.features();
		stove3.cookingFood();
		stove3.switchON();
		stove3.switchOFF();
		stove3.whistlePreset();
		stove3.settingTimer();

	}

}
