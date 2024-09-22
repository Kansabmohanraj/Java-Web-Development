package org.phone;

public class PhoneInfo {
	private void phoneName () {
		System.out.println("Realme 8i");
	}
	
	private void phoneMieiNum () {
		System.out.println("aa-bb-cc-dd");
	}
	
	private void camera () {
		System.out.println("50mp");
	}
	
	private void storage () {
		System.out.println("128 Gb");
	}
	
	private void osName () {
		System.out.println("Realme UI");
	}
	
	public static void main(String[]args) {
		PhoneInfo p = new PhoneInfo();
		p.phoneName();
		p.phoneMieiNum();
		p.camera();
		p.storage();
		p.osName();
	}

}


