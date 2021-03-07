package com.xworkz.objects;

import java.util.Scanner;

public class PrimeNumber {
	public static String num(int n) {
		int i,d,s=0;
		for(i=2;i<n;i++) {
		if(n%i==0)
			return " not a prime number.";
		}
		return " a prime number .";
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int n=in.nextInt();
		System.out.println("The number is"+num(n));

}
}
