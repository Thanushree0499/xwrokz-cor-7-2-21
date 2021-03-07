package com.xworkz.structuralDesignPatterns.AdapterDesignPatterns;

public interface SocketAdapter {
	
	public Volt get3volt();
	
	public Volt get12volt();
	
	public Volt get120volt();
	
}
