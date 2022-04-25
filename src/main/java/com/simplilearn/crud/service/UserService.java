package com.simplilearn.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.crud.entity.User;
import com.simplilearn.crud.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;

	public User addUser(User user) {
		return repo.save(user);
	}

	public List<User> getAllUsers() {
		return repo.findAll();
	}

	public User getUserById(int id) {
		if (repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		else
			return null;
		
	}

	public User updateUser(int id, User user) {

		if (repo.findById(id).isPresent()) {

			User old = repo.findById(id).get();
			old.setName(user.getName());
			old.setEmail(user.getEmail());
			old.setCountry(user.getCountry());

			return repo.save(old);
		} else
			return null;
	}

	public boolean deleteUser(int id) {
		
		if (repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return true;
		}
		else
			return false;
	}
}
