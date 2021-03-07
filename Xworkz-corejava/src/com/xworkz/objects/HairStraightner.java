package com.xworkz.objects;

public class HairStraightner {
	String brand;
	static int price=5000;
	String model;
	String color;
	String sizeOfIronPlates;
	int warranty;
	String material;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSizeOfIronPlates() {
		return sizeOfIronPlates;
	}
	public void setSizeOfIronPlates(String sizeOfIronPlates) {
		this.sizeOfIronPlates = sizeOfIronPlates;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void features() {
		System.out.println("brand "+brand+" price "+price+" model "+model+" color "+color+" iron plates "+sizeOfIronPlates+" warranty "+warranty+" material "+material);
	}
	public void straightening() {
		System.out.println("straightner use to straighten hairs");
	}
	public void curling() {
		System.out.println("straightner use to curl hairs");
	}
	public void temperatureSetting() {
		System.out.println("set the temperature accordingly");
	}
	public void lockingSystem() {
		System.out.println("we can lock and unlock the straightner");
	}
	public void switchOn() {
		System.out.println("using power button we can switch on straightner");
	}
	public void switchOff() {
		System.out.println("using power button we can switch off straightner");
	}
	public HairStraightner(String brand, int price, String model, String color, String sizeOfIronPlates, int warranty,
			String material) {
		super();
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.color = color;
		this.sizeOfIronPlates = sizeOfIronPlates;
		this.warranty = warranty;
		this.material = material;
	}
	HairStraightner(){
		
	}
	
}
