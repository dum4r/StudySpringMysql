package com.trabajo.api.apirest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trabajo.api.apirest.model.User;

@RestController	
public class UserControl {
	

	@Autowired
	private UserService userService;
	
	@GetMapping("api/users")
	public List<User> getUsers(){
		return userService.allUsers();
	}
	

	@GetMapping("api/users/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		return userService.getIdUser(id);
	}
	
	@PostMapping("api/users")
	public User saveUser(@RequestBody User user) {
		userService.save(user);
		return null;
	}
	
	@PutMapping("api/users")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@DeleteMapping("api/users/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
	}
}
