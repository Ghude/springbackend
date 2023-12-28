package com.backend.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.backend.entity.UserData;
import com.backend.repository.UserRepo;
import com.backend.service.UserDataService;

@Service
public class UserDataServiceImp implements UserDataService{

	@Autowired
	UserRepo userrepo;
	
	@PostMapping
	public void addUser(UserData user) {
		userrepo.save(user);
	}

	@Override
	public List<UserData> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserData getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserData updateUserData(Long id, UserData updatedUserData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserData(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
