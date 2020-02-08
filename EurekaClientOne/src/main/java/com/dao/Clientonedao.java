package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface Clientonedao {

	List<User> userlist(User user);
	
	User finduser(User user);

}
