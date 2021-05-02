package interfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new BaseCustomerManager() {
		};
		customerManager.save(new Customer(1,"Kaan","Monun","1998","Turkish"));
	}

}
