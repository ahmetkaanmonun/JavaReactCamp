package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomer extends BaseCustomerManager {
	
	private CustomerCheckService checkService;

	public StarbucksCustomer(CustomerCheckService checkService) {
		super();
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		
		if (checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
		System.out.println("Not a valid person");
		}
	}

	

}
