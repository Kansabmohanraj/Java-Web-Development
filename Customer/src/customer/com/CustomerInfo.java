package customer.com;

public class CustomerInfo {
	private void customerName () {
		System.out.println("Kansab");
	}
	
	private void customerId () {
		System.out.println("786");
	}
	
	private void customerAddress () {
		System.out.println("Karur");
	}
	
	public static void main(String[]args) {
		CustomerInfo c = new CustomerInfo();
		c.customerName();
		c.customerId();
		c.customerAddress();
	}

}
