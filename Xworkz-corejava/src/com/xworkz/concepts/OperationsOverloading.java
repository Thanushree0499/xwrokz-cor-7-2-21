package com.xworkz.concepts;

public class OperationsOverloading {
	public void performOperation() {
		System.out.println("no operands to perform operations");
	}
	public void performOperation(int a) {
		System.out.println("a is "+a);
	}
	public void performOperation(float a) {
		System.out.println("a is "+a);
	}
	public void performOperation(int a,int b) {
		System.out.println("a is "+a+" b is "+b);
	}
	public double performOperation(double a) {
		return a*a;
	}
	public double performOperation(double a, double b) {
		return a*b;
	}
	public String performOperation(String a) {
		return a;
	}
}
