package nLayeredRegisterationSytemSimulation.core.abstracts;

import nLayeredRegisterationSytemSimulation.entity.concrete.User;

public interface RegisterService {
	User register(String mail,String password);

}
