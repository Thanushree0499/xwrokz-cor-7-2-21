package com.xworkz.objects;

public class Tree {
	String name;
	String scientificName;
	String typeOfRoot;
	int treeID;
	String fruitName;
	int height;
	String leafCategory;
	public void treeFeatures() {
		System.out.println("tree name "+name+" scientific name "+scientificName+" bearing id "+treeID+" root system "+typeOfRoot+" produces fruit"+fruitName+" height "+height+" leaf size "+leafCategory);
	}
	public void flowering() {
		System.out.println("tree produces flower");
	}
	public void bearingFruit() {
		System.out.println("tree produces fruit");
	}
	public void oxygen() {
		System.out.println("tree provides oxygen to humans");
	}
	public void sheddingLeaves() {
		System.out.println("tree shed leaves");
	}
	public void treeGrowing() {
		System.out.println("tree grows until it reaches its specified height");
	}
	public void branching() {
		System.out.println("tree branches out as it grows");
	}
	
}
