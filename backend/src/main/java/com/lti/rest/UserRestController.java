package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.User;
import com.lti.pojo.Login;
import com.lti.service.UserService;


/**
 * @author yashwanth
 *
 * @version 1.8
 */

@CrossOrigin
@RestController
public class UserRestController {
	@Autowired
	private UserService service;
	@PostMapping(value = "/add", consumes = "application/json")
	public String addUser(@RequestBody User user) {
		service.persist(user);
		return "User added successfully";
	}
	
	@GetMapping(value = "/fetch/{uname}", produces = "application/json")
	public User fetchUser(@PathVariable String uname) {
		return service.find(uname);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<User> listEmployee(){
		return service.load();
	}
	
	@PutMapping(value = "/edit", consumes = "application/json")
	public String updateEmployee(@RequestBody User user) {
		service.edit(user);
		return "Employee updated successfully";
	}
	

	@GetMapping(value = "/login", produces = "application/json")
	public User login(@RequestParam("uname") String uname,@RequestParam("password") String password) {
		Login login = new Login(uname, password);
		User user = service.validate(login);
		System.out.println(user.getUname() + "\t" + user.getPassword());
		
		return user;
	}
}
