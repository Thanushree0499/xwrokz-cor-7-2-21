package com.xworkz.concepts;

public class MainOverloading {

	public static void main(String[] args) {
		double res1;
		double res2;
		String res;
		OperationsOverloading operationOverloading = new OperationsOverloading();
		operationOverloading.performOperation();
		operationOverloading.performOperation(2);
		operationOverloading.performOperation(2.1f);
		operationOverloading.performOperation(10,20);
		res1=operationOverloading.performOperation(3.45);
		System.out.println(res1);
		res2=operationOverloading.performOperation(6.78,7.896);
		System.out.println(res2);
		res=operationOverloading.performOperation("thanu");
		System.out.println(res);
		
	}

	
}
