package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.User;
@Service
public interface UserService {
	//create
  User createUser(User user);
  //retrieve
  User getUserById(Long userId);
  //list
  List<User> getAllUsers();
  //update
  User updateUser(User user);
  //delete
  void deleteUser(Long userId);
}
