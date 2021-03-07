package com.xworkz.cosmetic.dto;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;

public class CosmeticDTO {

	private String brand;
	private CosmeticType type;
	private CosmeticShades shades;
	private int price;
	private int quantity;

	public CosmeticDTO() {

	}

	public CosmeticDTO(String brand, CosmeticType type, CosmeticShades shades, int price, int quantity) {
		super();
		this.brand = brand;
		this.type = type;
		this.shades = shades;
		this.price = price;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public CosmeticType getType() {
		return type;
	}

	public void setType(CosmeticType type) {
		this.type = type;
	}

	public CosmeticShades getShades() {
		return shades;
	}

	public void setShades(CosmeticShades shades) {
		this.shades = shades;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", type=" + type + ", shades=" + shades + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		if (obj instanceof CosmeticDTO) {

			CosmeticDTO casted = (CosmeticDTO) obj;
			if (this.brand != null && this.type != null) {
				if (this.brand.equals(casted.getBrand()) && this.type.equals(casted.type)) {
					System.out.println("CosmeticDTOis equal");
					return true;

				}
			}
		}
		System.out.println("CosmeticDTO is not equal");
		return false;
	}
}