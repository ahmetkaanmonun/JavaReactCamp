package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.User;

public interface UserService {
	
	List<User> getAll();
	
	Result add(User user);
}
