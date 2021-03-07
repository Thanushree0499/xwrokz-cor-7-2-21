package com.xworkz.structuralDesignPatterns;

import com.xworkz.structuralDesignPatterns.AdapterDesignPatterns.SocketAdapter;
import com.xworkz.structuralDesignPatterns.AdapterDesignPatterns.SocketAdapterImpl;
import com.xworkz.structuralDesignPatterns.AdapterDesignPatterns.Volt;

public class AdapterTester {

	public static void main(String[] args) {
		SocketAdapter adapter=new SocketAdapterImpl();
		Volt volt3=getVolt(adapter, 3);
		Volt volt12=getVolt(adapter, 12);
		Volt volt120=getVolt(adapter, 120);
		Volt volt60=getVolt(adapter, 120);
		
		System.out.println("volt3: "+volt3.getVolts());
		System.out.println("volt12: "+volt12.getVolts());
		System.out.println("volt120: "+volt120.getVolts());
		System.out.println("volt60: "+volt60.getVolts());
		
	}

		private static Volt getVolt(SocketAdapter adapter ,int i) {
			switch(i){
				case 3:
					return adapter.get3volt();
				case 12: 
					return adapter.get12volt();
				case 120: 
					return adapter.get120volt();
				default : 
					return adapter.get120volt();
			}
		}

	}


