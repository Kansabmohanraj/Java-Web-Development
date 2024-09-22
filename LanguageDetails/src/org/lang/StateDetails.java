package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("Tamil Nadu");
	}
	
	public void northIndia() {
		System.out.println("Rajesthan");
	}
	
	public static void main(String[]args) {
		StateDetails s = new StateDetails();
		s.southIndia();
		s.northIndia();
		
		LanguageDetails l = new LanguageDetails();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
	}

}
