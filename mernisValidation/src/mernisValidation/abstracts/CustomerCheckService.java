package mernisValidation.abstracts;

import java.rmi.RemoteException;

import mernisValidation.entities.Customer;

public interface CustomerCheckService
{
	boolean validatePerson(Customer customer) throws NumberFormatException, RemoteException;
}
