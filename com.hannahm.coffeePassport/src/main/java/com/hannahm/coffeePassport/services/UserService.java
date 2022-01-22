package com.hannahm.coffeePassport.services;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hannahm.coffeePassport.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	public List<User> getAllUsers(){
		return this.uRepo.findAll();
	}
	public User getOneUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	public User registerUser(User user) {
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hash);
		return this.uRepo.save(user);
	}
	public boolean authenticateUser(String email, String password) {
		User user = this.uRepo.findByEmail(email);
		if(user==null) {
			return false;
		}
		return BCrypt.checkpw(password, user.getPassword());
	}
	public User getUserByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}

}
