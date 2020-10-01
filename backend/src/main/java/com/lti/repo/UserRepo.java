package com.lti.repo;

import java.util.List;


import com.lti.entity.User;
import com.lti.pojo.Login;
/**
 * @author yashwanth
 *
 * @version 1.8
 */
public interface UserRepo {
void save(User user);
	
	User fetch(String uname);
	
	List<User> list();
	
	void update(User user);
	
	User verifyLogin(Login login);
	
	List<User> fetchIfYes();
	
	List<User> fetchAll();
}
