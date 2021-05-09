package mernisValidation.abstracts;

import mernisValidation.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception
	{
		System.out.println("The user named " +customer.getFirstName()+ " has been registered to the system");
		
	}

}
