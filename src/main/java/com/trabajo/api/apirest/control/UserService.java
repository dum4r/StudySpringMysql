package com.trabajo.api.apirest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajo.api.apirest.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public void save(User user) {
		userRepository.save(user);
	}
	
	public List<User> allUsers(){
		return userRepository.findAll();
	}
	
	public User getIdUser(Integer id) {
		return userRepository.getOne(id);
	}
	
	public void updateUser(User user) {
		userRepository.save(user);
	}	
	
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
}
