package io.northwind.business.abstracts;

import io.northwind.core.entities.User;
import io.northwind.core.utilities.results.DataResult;
import io.northwind.core.utilities.results.Result;

public interface UserService {

	Result add(User user);
	DataResult<User>findByemail(String email);
}
