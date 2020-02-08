package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.dao.Clientonedao;
import com.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RequestMapping("/clientone")
@RestController
public class Clientonecontroller {
	
	@Autowired
	Clientonedao clientonedao;
	
	
	
	@CrossOrigin(origins = "*")
	   @RequestMapping(value = "/userlist", method = RequestMethod.POST)
	   public  Map<String, Object> userlist(@RequestBody User user,
	           HttpServletRequest request, HttpServletResponse response) {
	       System.out.println("inside userlist..userlist111111111111111111111111111111  "+request.getLocalPort());
	      /* System.out.println(request.getLocalPort());
	       System.out.println(request.getLocalAddr());
	       System.out.println(request.getLocalAddr());
	       System.out.println(request.getRemoteAddr());
	       System.out.println(request.getRemoteHost());
	       System.out.println(request.getServerPort());*/
	       response.setContentType("application/json");
	       response.setStatus(HttpServletResponse.SC_OK);
	       response.setStatus(200);
	       Map<String, Object> map = null;
	       map = new HashMap<String, Object>();
	       try {
	           List<User> userlist = clientonedao.userlist(user);
	           if (userlist != null) {

	               map.put("Success", true);
	               map.put("Message", "Success");
	              
	               map.put("userlist", userlist);
	               
	           } else {
	               map.put("Success", false);
	               map.put("Message", "no list");
	           }
	           return map;

	       } catch (Exception e) {
	           e.printStackTrace();
	           map.put("Success", false);
	           map.put("Message", "error occured");
	           return map;
	       }

	   }
	
	
	
	
	/*@CrossOrigin(origins = "*")
	@HystrixCommand(fallbackMethod = "getDataFallBack")
	   @RequestMapping(value = "/userlist", method = RequestMethod.POST)
	   public  Map<String, Object> userlist(@RequestBody User user,
	           HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("==================inside controller======================");
	       response.setContentType("application/json");
	       response.setStatus(HttpServletResponse.SC_OK);
	       response.setStatus(200);
	       Map<String, Object> map = null;
	       map = new HashMap<String, Object>();
	   
	       List<User> userlist = clientonedao.userlist(user);
		   if (userlist != null) {
			   
			   User u=null;
			   System.out.println(u.getDistance());

		       map.put("Success", true);
		       map.put("Message", "Success");
		      
		       map.put("userlist", userlist);
		       
		   } else {
		       map.put("Success", false);
		       map.put("Message", "no list");
		   }
	       
		   return map;

	   }
	
	
	*/
	
	
public  Map<String, Object> getDataFallBack(User u,HttpServletRequest request, HttpServletResponse response) {
		System.out.println("==================inside fallback======================");
	User emp = new User();
	ArrayList<User> userlist=new ArrayList<>();
	userlist.add(emp);
	 Map<String, Object> map = null;
     map = new HashMap<String, Object>();
	
	  map.put("Success", true);
      map.put("Message", "Success");
     
      map.put("userlist", userlist);

		return map;
		
	}
	
	
	
	
	@CrossOrigin(origins = "*")
	   @RequestMapping(value = "/finduser", method = RequestMethod.POST)
	   public  Map<String, Object> finduser(@RequestBody User user,
	           HttpServletRequest request, HttpServletResponse response) {
	       System.out.println("inside finduser..");
	       response.setContentType("application/json");
	       response.setStatus(HttpServletResponse.SC_OK);
	       response.setStatus(200);
	       Map<String, Object> map = null;
	       map = new HashMap<String, Object>();
	       try {
	           User finduser = clientonedao.finduser(user);
	           if (finduser != null) {

	               map.put("Success", true);
	               map.put("Message", "Success");
	              
	               map.put("finduser", finduser);
	               
	           } else {
	               map.put("Success", false);
	               map.put("Message", "no list");
	           }
	           return map;

	       } catch (Exception e) {
	           e.printStackTrace();
	           map.put("Success", false);
	           map.put("Message", "error occured");
	           return map;
	       }

	   }
	
	

}
