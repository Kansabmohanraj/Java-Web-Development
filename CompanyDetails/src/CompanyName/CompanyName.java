package CompanyName;

public class CompanyName {
	private void companyName () {
		System.out.println("Amazon");
	}
	
	private void companyId () {
		System.out.println("A12");
	}
	
	private void companyAddress () {
		System.out.println("Chennai");
	}
	
	public static void main(String[]args) {
		CompanyName c = new CompanyName();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}

}


