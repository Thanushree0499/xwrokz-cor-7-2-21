package com.xworkz.cosmetic;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.service.CosmeticService;
import com.xworkz.cosmetic.service.CosmeticServiceImpl;

public class ValidTester {

	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO=new CosmeticDTO();
		cosmeticDTO.setBrand("MAC");
		cosmeticDTO.setPrice(100);
		cosmeticDTO.setQuantity(12);
		cosmeticDTO.setShades(CosmeticShades.BEIGE);
		cosmeticDTO.setType(CosmeticType.CONCEALER);
		
	CosmeticService cosmeticService=new CosmeticServiceImpl();
	cosmeticService.validateAndSave(cosmeticDTO);
		
	}

}
