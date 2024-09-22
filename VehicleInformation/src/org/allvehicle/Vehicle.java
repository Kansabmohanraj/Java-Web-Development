package org.allvehicle;

import org.twowheeler.*;
import org.threewheeler.*;
import org.fourwheeler.*;

public class Vehicle {
	public void vehicleNecessery() {
		System.out.println("Yes");
	}
	
	public static void main(String[]args) {
		Vehicle v = new Vehicle();
		v.vehicleNecessery();
		
		Twowheeler t = new Twowheeler();
		t.bike();
		t.cycle();
	
		Threewheeler t1 = new Threewheeler();
		t1.auto();
		
		Fourwheeler f = new Fourwheeler();
		f.car();
		f.bus();
		f.lorry();
		
	}

}
