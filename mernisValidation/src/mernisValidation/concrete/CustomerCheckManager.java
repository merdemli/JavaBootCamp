package mernisValidation.concrete;

import mernisValidation.abstracts.CustomerCheckService;
import mernisValidation.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean validatePerson(Customer customer) {
		
		return true ;
	}

}
