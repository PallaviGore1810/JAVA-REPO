package com.jspiders.springrest.service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springrest.pojo.User;
import com.jspiders.springrest.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.addUser(user);
	}

	@SuppressWarnings("null")
	public List<User> findAllUser() {
		List<User> users = userRepository.findAllUser();
		if (users != null || users.size() > 0) {
			return users;
		} else {
			return null;
		}
	}
	
	public User validateUser(String userName, String password) {
		try {
			User user = userRepository.validateUser(userName, password);
			return user;
		} catch (NoResultException e) {
			return null;
		}
	}

	public User updateUser(User user) {
		return userRepository.updateUser(user);
	}

	public User deleteUser(int id) {
		return userRepository.deleteUser(id);
	}

	public User updateCarListForUser(int userId, int carId) {
		return userRepository.updateCarListForUser(userId, carId);
	}

}
