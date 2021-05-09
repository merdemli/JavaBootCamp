package mernisValidation.adapters;

import java.rmi.RemoteException;

import mernisValidation.abstracts.CustomerCheckService;
import mernisValidation.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean validatePerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
													customer.getFirstName().toUpperCase(),
													customer.getLastName().toUpperCase(),
													customer.getDateOfBirth().getYear());
		return result;
	}

}
