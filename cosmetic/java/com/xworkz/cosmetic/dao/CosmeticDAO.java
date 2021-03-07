package com.xworkz.cosmetic.dao;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO {
	
	boolean save(CosmeticDTO dto);

	CosmeticDTO find(String brand, CosmeticType type);

	CosmeticDTO findByBrand(String brand);

	boolean updatePriceByBrandAndType(int price, String brand, CosmeticType type);

	boolean updatePriceAndQuantityByBrand(int price, int quantity, String brand);

	boolean updateTypeByBrand(String brand, CosmeticType type);
	
	boolean deleteByBrand(String brand);
	
	void deleteAll();
	
	//List<CosmeticDTO> getAll();
	
	int totalSize();
	

}
