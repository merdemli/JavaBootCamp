package mernisValidation.concrete;

import mernisValidation.abstracts.BaseCustomerManager;
import mernisValidation.abstracts.CustomerCheckService;
import mernisValidation.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	
	@Override
	public void save(Customer customer) throws Exception  //abstract'tan geldi
	{
	
		if(customerCheckService.validatePerson(customer)) 
		{	
		super.save(customer);
		}
		
		else
			System.out.println("Not a valid person! \n Please check the entered id information");
			
	}
	

}
