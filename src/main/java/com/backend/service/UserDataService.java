package com.backend.service;

import java.util.List;

import com.backend.entity.UserData;


public interface UserDataService {
	public void addUser(UserData user);

	public List<UserData> getAllUsers();

    public UserData getUserById(Long id);

    public UserData updateUserData(Long id, UserData updatedUserData);

    public void deleteUserData(Long id);
}
