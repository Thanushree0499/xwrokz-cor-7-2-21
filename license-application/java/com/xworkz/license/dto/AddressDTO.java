package com.xworkz.license.dto;

public class AddressDTO {
	
	private String street;
	private String area;
	private int pincode;
	private int doorNo;
	private String city;
	private String state;
	private String buildingName;
	
	public AddressDTO() {
		
	}

	public AddressDTO(String street, String area, int pincode, int doorNo, String city, String state,
			String buildingName) {
		super();
		this.street = street;
		this.area = area;
		this.pincode = pincode;
		this.doorNo = doorNo;
		this.city = city;
		this.state = state;
		this.buildingName = buildingName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	
	

}
