package inheritance;

public class Main {

	public static void main(String[] args) {
		
		
		IndividualCustomer engin = new IndividualCustomer();
		
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer sc = new SendikaCustomer();
		sc.customerNumber = "99999";
		
		Customer[] customers = {engin,hepsiBurada,sc};
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.addMultiple(customers);
		
		

	}

}
