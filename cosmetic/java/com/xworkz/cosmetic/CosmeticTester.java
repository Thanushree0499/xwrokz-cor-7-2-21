package com.xworkz.cosmetic;

import java.awt.Window.Type;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;


public class CosmeticTester {

	public static void main(String[] args) {
		 
		CosmeticDTO cosmeticDTO=new CosmeticDTO();
		cosmeticDTO.setBrand("Nykaa");
		cosmeticDTO.setType(CosmeticType.FOUNDATION);
		cosmeticDTO.setShades(CosmeticShades.BEIGE);
		cosmeticDTO.setQuantity(200);
		cosmeticDTO.setPrice(500);
		
		CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
		cosmeticDAO.save(cosmeticDTO);
		
		boolean updated=cosmeticDAO.updatePriceAndQuantityByBrand(300, 500, "Nykaa");
		System.out.println("updated"+ updated);
		
		CosmeticDTO dtoafterUpdate=cosmeticDAO.findByBrand("Nykaa");
		System.out.println(dtoafterUpdate);
		
		boolean updated1=cosmeticDAO.updatePriceByBrandAndType(700, "Nykaa",CosmeticType.CONCEALER);
		System.out.println("updated"+ updated1);
		
		CosmeticDTO dtoafterUpdate1=cosmeticDAO.findByBrand("Nykaa");
		System.out.println(dtoafterUpdate1);
		
		boolean updated2=cosmeticDAO.updateTypeByBrand("Nykaa", CosmeticType.HIGHLIGHTER);
		System.out.println("updated"+ updated2);
		
		CosmeticDTO dtoafterUpdate2=cosmeticDAO.findByBrand("Nykaa");
		System.out.println(dtoafterUpdate2);
		
		boolean deleted=cosmeticDAO.deleteByBrand("Nykaa");
		System.out.println("deleted");
		CosmeticDTO dtoafterDelete=cosmeticDAO.findByBrand("Nykaa");
		System.out.println(dtoafterDelete);
		
		cosmeticDAO.deleteAll();
		System.out.println("deleted all");
		
		int totalSize=cosmeticDAO.totalSize();
		System.out.println("total size : "+totalSize);
		
	}

}
