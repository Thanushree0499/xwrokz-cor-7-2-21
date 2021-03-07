package com.xworkz.objects;

import java.util.Scanner;

public class LargestNumber {
	public static int num(int n,int a[]) {
		int i,s=0;
		for(i=0;i<n;i++) {
			if(s<a[i])
			s=a[i];
		}
		    return s;
	}    
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=in.nextInt();
		int []a=new int[n];
		System.out.println("enter the elements of array");
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int m=num(n,a);
		System.out.println("largest number  = "+m);
	}

}
