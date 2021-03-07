package com.xworkz.objects;

public class PhonePay {
	public static void payment(long phoneno){
		System.out.println("mobile recharge sucessfull");
		}
		public static void payment(String DTH){
		System.out.println("DTH recharge sucessfull");
		}
		public static void payment(String name,int meterId,int amount){
		System.out.println("paid electricity bill of"+meterId+"rupees"+amount+"of"+name);
		}
		public static void payment(int creditCardNo,int amount){
		System.out.println("credit card bill paid sucessfully");
		}
	public static void main(String[] args) {
		PhonePay.payment(6798099);

	}

}
