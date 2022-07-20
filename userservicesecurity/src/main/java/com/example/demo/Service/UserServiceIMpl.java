package com.example.demo.Service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User2;
import com.example.demo.Repository.UserRepository;

@Service
public class UserServiceIMpl implements UserService {

	@Autowired
	private UserRepository repository;
	

	public Integer saveUser(User2 user2)
	{
		 repository.save(user2);
		return user2.getUid();
	}

	
}
