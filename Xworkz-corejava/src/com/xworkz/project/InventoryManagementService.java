package com.xworkz.project;

import java.util.Scanner;

public class InventoryManagementService {

	public static void main(String[] args) {
		InventoryManagementSystem ims=new InventoryManagementSystem();
		int choice;
		Scanner in=new Scanner(System.in);
		System.out.println("please enter your choice");
		choice=in.nextInt();
		while(true)
		{
		System.out.println("1.Add product 2.Delete Product 3.Display product details 4.Exit");
		switch(choice) {
		case 1:System.out.println("Inside Add Product Method");
		       ims.addProduct();
		       break;
		case 2:System.out.println("Inside Delete Product Method");
	           ims.deleteProduct();
	           break;
		case 3:System.out.println("Display Product details");
               ims.displayProductInformation();
               break;
		case 4:System.out.println("Exit");
               ims.exit();
               break;
   
			   
		}
		}
		
		}
	}


