package com.xworkz.cosmetic.service;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService{


	@Override
	public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData=true;
		if(cosmeticDTO!=null) {
			System.out.println("dto is not null, can validate fields");	
			String brand=cosmeticDTO.getBrand();
			if(validData) {
			if(brand!=null && brand.length()>=3 && brand.isEmpty() && brand.contains(" ")) {
				System.out.println("brand is valid");
				validData=true;
			}
			
			else {
				System.out.println("brand is not valid");
				validData=false;
			}
			}
			
			if(validData) {
			CosmeticType type=cosmeticDTO.getType();
			if(type!=null) {
				System.out.println("type is valid");
				validData=true;
			}
			else {
				System.out.println("type is not valid,its null");
				validData=false;
			}
			}
			if(validData) {
			CosmeticShades shade=cosmeticDTO.getShades();
			if(shade!=null) {
				System.out.println("shade is valid");
				validData=true;
			}
			else {
				System.out.println("shade is not valid, its null");
				validData=false;
			}
			}
			if(validData) {
			int price=cosmeticDTO.getPrice();
			if(price>0) {
				System.out.println("price is valid");
				validData=true;
			}
			else {
				System.out.println("price is not valid");
				validData=false;
			}
			}
			if(validData) {
			int quantity = cosmeticDTO.getQuantity();
			if(quantity>0 && quantity<=100) {
				System.out.println("quantity is valid");
				validData=true;
			}
			else {
				System.out.println("quantity is not valid");
				validData=false;
			}
			}		
		}
		else {
			System.out.println("dto is null");
		}
		return false;
	}

}
