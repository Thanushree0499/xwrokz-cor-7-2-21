package com.xworkz.objects;

import java.util.Scanner;

public class Palindrome {
	public static String num(int n) {
		int x,d,sum=0;
		x=n;
		while(x!=0) {
			d=x%10;
			x=x/10;
			sum=sum*10+d;
		}
		if(sum==n)
			return "palindrome";
		else
			return "not palindrome";
		
		}
			
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int n=in.nextInt();
		System.out.println("The number is "+num(n));
	}

}
