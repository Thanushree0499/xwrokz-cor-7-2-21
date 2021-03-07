package com.xworkz.structuralDesignPatterns.AdapterDesignPatterns;

public class SocketAdapterImpl implements SocketAdapter {

	Socket sock = new Socket();

	@Override
	public Volt get3volt() {
		Volt v = sock.getVolt();
		return convertedVolt(v, 40);
	}

	@Override
	public Volt get12volt() {
		Volt v = sock.getVolt();
		return convertedVolt(v, 10);
	}

	@Override
	public Volt get120volt() {
		return sock.getVolt();
	}

	public Volt convertedVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}

}
