package org.network;

public class Wifi {
	public void wifiName() {
		System.out.println("Realme 8i");
	}
	
	public static void main (String[]args) {
		Wifi w = new Wifi();
		w.wifiName();
		
		MobileData m = new MobileData();
		m.dataName();
		
		Lan l = new Lan();
		l.lanName();
		
		Wireless w1 = new Wireless();
		w1.modemName();
	}

}
