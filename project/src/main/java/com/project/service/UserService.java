package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.User;
import com.project.repositary.UserRepositary;

@Service
public class UserService {
@Autowired
private UserRepositary userRepository;


public User createUser(User user ) {
	return userRepository.save(user);
	}

public List<User> createUsers(List<User> users ) {
	return userRepository.saveAll(users);
	}

public User getUserById(int id) {
	return userRepository.findById(id).orElse(null);
}

public List<User> getUsers() {
	return userRepository.findAll();
}

public User updateUser(User user) {
	User oldUser=null;
	Optional<User> optionaluser=userRepository.findById(user.getId());
	if(optionaluser.isPresent()) {
		oldUser=optionaluser.get();
		oldUser.setFirstname(user.getFirstname());
		oldUser.setLastname(user.getLastname());
		oldUser.setEmailid(user.getEmailid());
		userRepository.save(oldUser);
	
		
	}else {
		return new User();
	}
	return oldUser;
}

public String deleteUserById(int id) {
	userRepository.deleteById(id);
	return "User got deleted";
}


}