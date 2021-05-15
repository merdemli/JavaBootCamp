package nLayeredRegisterationSytemSimulation.core.concrete;

import nLayeredRegisterationSytemSimulation.core.abstracts.EmailTransferService;
import nLayeredRegisterationSytemSimulation.outSourceServices.jMailTransferManager.JMailTransferManager;

public class EmailTransferManagerAdapter implements EmailTransferService {

	@Override
	public void sendMail(String mail, String mailAddress) //for vertification
	{
		
		JMailTransferManager mailTransferManager = new JMailTransferManager();
		//new JEMailTransferManager().sendMail(mail,mailAdress);
		
		mailTransferManager.sendMail(mail, mailAddress);
	}

}
