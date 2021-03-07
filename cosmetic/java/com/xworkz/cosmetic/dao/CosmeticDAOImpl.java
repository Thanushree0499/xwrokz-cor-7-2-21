package com.xworkz.cosmetic.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	private List<CosmeticDTO> cosmetics = new ArrayList<CosmeticDTO>();

	@Override
	public boolean save(CosmeticDTO dto) {
		System.out.println("invoked save");
		System.out.println("dto is " + dto);
		boolean added = cosmetics.add(dto);
		if (added) {
			System.out.println("cosmetic added");
		} else {
			System.out.println("cosmetic not added");
		}
		return added;
	}

	@Override
	public CosmeticDTO find(String brand, CosmeticType type) {

		System.out.println("invoked find");
		System.out.println("brand:" + brand + "cosmetic type :" + type);
		for (CosmeticDTO cosmeticDTO : cosmetics) {

			String brandfromcosmetics = cosmeticDTO.getBrand();
			CosmeticType typefromcosmetics = cosmeticDTO.getType();
			if (brandfromcosmetics.equals(brand) && typefromcosmetics.equals(type)) {
				System.out.println("cosmetic found");
				return cosmeticDTO;
			}
		}
		return null;
	}

	@Override
	public CosmeticDTO findByBrand(String brand) {
		System.out.println("invoked findByBrand");
		System.out.println("brand:" + brand);
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			String brandfromcosmetics = cosmeticDTO.getBrand();
			if (brandfromcosmetics.equals(brand)) {
				System.out.println("cosmetic found");
				return cosmeticDTO;
			}
		}
		return null;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(int price, int quantity, String brand) {
		System.out.println("updatePriceAndQuantityByBrand");
		System.out.println("price:" + price);
		System.out.println("quantity:" + quantity);
		System.out.println("brand:" + brand);
		CosmeticDTO dtoFromCosmetic = this.findByBrand(brand);
		if (dtoFromCosmetic != null) {
			System.out.println("can update , cosmetic is found");
			dtoFromCosmetic.setPrice(price);
			dtoFromCosmetic.setQuantity(quantity);
			return true;
		} else {
			System.out.println("cannot update , cosmetic not found");
		}
		return false;

	}

	@Override
	public boolean updatePriceByBrandAndType(int price, String brand, CosmeticType type) {

		System.out.println("updatePriceAndQuantityByBrandAndType");
		System.out.println("price:" + price);
		System.out.println("brand:" + brand);
		System.out.println("CosmeticType:" + type);
		CosmeticDTO dtoFromCosmetic = this.find(brand, type);
		if (dtoFromCosmetic != null) {
			System.out.println("can update , cosmetic is found");
			dtoFromCosmetic.setPrice(price);
			return true;
		} else {
			System.out.println("cannot update , cosmetic not found");
		}
		return false;

	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		System.out.println("updateTypeByBrand");
		System.out.println("brand:" + brand);
		System.out.println("CosmeticType:" + type);
		CosmeticDTO dtoFromCosmetic = this.findByBrand(brand);
		if (dtoFromCosmetic != null) {
			System.out.println("can update , cosmetic is found");
			dtoFromCosmetic.setType(type);
			return true;
		} else {
			System.out.println("cannot update , cosmetic not found");
		}
		return false;

	}

	@Override
	public boolean deleteByBrand(String brand) {

     CosmeticDTO dtoCosmetics = this.findByBrand(brand);
     if(dtoCosmetics!=null) {
    	 this.cosmetics.remove(dtoCosmetics);
     }
		return false;
	}

	@Override
	public void deleteAll() {
		cosmetics.clear();
		
	}

	
	/*@Override
	public boolean getAll() {
		boolean addedAll=cosmetics.addAll(cosmetics);
		if(addedAll) {
			System.out.println("added all the elements");
			return true;
		}
		return false;
	}*/
	@Override
	public int totalSize() {
		System.out.println("total size of cosmetic collection: "+cosmetics.size());
		return cosmetics.size();
	}


}
