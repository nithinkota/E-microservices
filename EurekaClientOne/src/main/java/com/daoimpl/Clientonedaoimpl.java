package com.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.dao.Clientonedao;
import com.model.User;

@Service
public class Clientonedaoimpl implements Clientonedao{
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	
	public List<User> userlist(User user){
		
		return mongoTemplate.findAll(User.class,"User");
		
	}
	
	
	public User finduser(User user) {
		
		return mongoTemplate.findOne(new Query(Criteria.where("userID").is(user.getUserID())), User.class,"User");
	}

}
