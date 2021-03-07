package com.xworkz.structuralDesignPatterns.AdapterDesignPatterns;

public class Socket {

	 public Volt getVolt() {
		 return new Volt(120);
	 }
}
