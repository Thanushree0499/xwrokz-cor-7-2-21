package com.xworkz.objects;

public class StraightnerWorking {

	public static void main(String[] args) {
		HairStraightner h1=new HairStraightner();
		h1.setBrand("philips");
		h1.setColor("black");
		h1.setMaterial("ceramic");
		h1.setModel("philips kerasmooth");
		h1.setPrice(2000);
		h1.setSizeOfIronPlates("wide");
		h1.setWarranty(2);
		System.out.println(h1.getBrand());
		System.out.println(h1.getClass());
		System.out.println(h1.getColor());
		System.out.println(h1.getMaterial());
		System.out.println(h1.getModel());
		System.out.println(h1.getPrice());
		System.out.println(h1.getSizeOfIronPlates());
		System.out.println(h1.getWarranty());
		
		HairStraightner h2=new HairStraightner();
		h2.setBrand("vega");
		h2.setColor("black");
		h2.setMaterial("ceramic");
		h2.setModel("philips kerasmooth");
		h2.setPrice(4000);
		h2.setSizeOfIronPlates("wide");
		h2.setWarranty(2);
		System.out.println(h2.getBrand());
		System.out.println(h2.getClass());
		System.out.println(h2.getColor());
		System.out.println(h2.getMaterial());
		System.out.println(h2.getModel());
		System.out.println(h2.getPrice());
		System.out.println(h2.getSizeOfIronPlates());
		System.out.println(h2.getWarranty());
		
		
		
		

	}

}
