package org.transport;

import org.road.*;
import org.air.*;
import org.water.*;


public class Transport {
	public void transportForm() {
		System.out.println("xxx");
	}
	
	public static void main(String[]args) {
		Transport t = new Transport();
		t.transportForm();
		
		Road r = new Road();
		r.bike();
		r.cycle();
		r.bus();
		r.car();
		
		Air a = new Air();
		a.aeroPlane();
		a.heliCopter();
		
		Water w = new Water();
		w.boat();
		w.ship();
	}

}
