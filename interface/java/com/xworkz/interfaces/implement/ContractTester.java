package com.xworkz.interfaces.implement;


public class ContractTester {

	public static void main(String[] args) {
		
		RedBusContractImpl contractImpl=new RedBusContractImpl();
		contractImpl.close();
		
		RedBusContract busContract=new RedBusContractImpl();
		busContract.close();
		
		Security security=new RedBusContractImpl();
		security.open();
		
		Contract contract=new RedBusContractImpl();
		int book=contract.maxBooking();
		System.out.println(book);
		
		
		
		

		
	}

}
