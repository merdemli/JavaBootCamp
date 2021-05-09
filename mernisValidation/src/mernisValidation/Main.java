package mernisValidation;


import java.util.Date;

import mernisValidation.abstracts.BaseCustomerManager;
import mernisValidation.adapters.MernisServiceAdapter;
import mernisValidation.concrete.CustomerCheckManager;
import mernisValidation.concrete.NeroCustomerManager;
import mernisValidation.concrete.StarbucksCustomerManager;
import mernisValidation.entities.Customer;



public class Main 
{
	public static void main(String[]args) throws Exception {
	Customer customer1= new Customer(1,"Merve","Erdemli", new Date(1988,10,18), "23614668602");


	BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	customerManager.save(customer1);
	}
	
}
 