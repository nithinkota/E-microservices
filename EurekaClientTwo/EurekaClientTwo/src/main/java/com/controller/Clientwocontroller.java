package com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.model.User;




@RequestMapping("/clienttwo")
@RestController
public class Clientwocontroller {
	
@Autowired
	private DiscoveryClient discoveryClient;
	
	
	@Autowired
	private LoadBalancerClient loadBalancer;
	
	
	
	@CrossOrigin(origins = "*")
	   @RequestMapping(value = "/userlisttwo", method = RequestMethod.POST)
	   public  Map<String, Object> userlist(@RequestBody User user,
	           HttpServletRequest request, HttpServletResponse response) {
		  System.out.println("inside userlist..userlisttwo==================================================");
	       response.setContentType("application/json");
	       response.setStatus(HttpServletResponse.SC_OK);
	       response.setStatus(200);
	       Map<String, Object> map = null;
	       map = new HashMap<String, Object>();
	       try {
	    	   HashMap m=new HashMap<>();
	    	   m=	   getEmployee();
	    	   
	    	  /* for(int i=0;i<100;i++) {
	    	   m=	   getEmployee();
	    	   }*/
	    	   
	    	   
	               map.put("Success", false);
	               map.put("Message", "no list is there");
	               map.put("userlist",m.get("userlist"));
	               return map;
	           
	           

	       } catch (Exception e) {
	           e.printStackTrace();
	           map.put("Success", false);
	           map.put("Message", "error occured");
	           return map;
	       }

	   }
	
	
	
	public HashMap getEmployee() throws RestClientException, IOException {
		//System.out.println("insied metod");
		
		/*List<ServiceInstance> instances = discoveryClient.getInstances("EurekaZuul");
		System.out.println("instances  "+instances.size());
		ServiceInstance serviceInstance = instances.get(0);
		System.out.println("serviceInstance   "+serviceInstance.getServiceId());*/
		
ServiceInstance serviceInstance=loadBalancer.choose("EurekaZuul");
		
		System.out.println(serviceInstance.getMetadata());
		
		String baseUrl=serviceInstance.getUri().toString();
		
		System.out.println("baseUrl  "+baseUrl);
		
	/*	List<ServiceInstance> instances=discoveryClient.getInstances("EurekaClientOne");
		System.out.println("instances size "+instances.size());
		ServiceInstance serviceInstance=instances.get(0);*/
		System.out.println("serviceInstance   "+serviceInstance.getHost());
		System.out.println("serviceInstance   "+serviceInstance.getPort());
		System.out.println("serviceInstance   "+serviceInstance.getUri());
		System.out.println("serviceInstance   "+serviceInstance.getMetadata());
		
		//String baseUrl=serviceInstance.getUri().toString();
		
		//System.out.println("baseUrl  "+baseUrl);

		//String baseUrl = "http://localhost:9010/clientone/userlist";
		
		RestTemplate restTemplate = new RestTemplate();
	
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		
		User u=new User();
		String a=baseUrl+"/EurekaClientOne/clientone/userlist";
		System.out.println("a  "+a);
		
		HttpEntity entity = new HttpEntity(u,headers);
		
		ResponseEntity<HashMap> out = restTemplate.exchange(baseUrl+"/EurekaClientOne/clientone/userlist", HttpMethod.POST, entity
			    , HashMap.class);

		//System.out.println("response==================  "+ out.getBody().get("Success"));
		//System.out.println("response==================  " +out.getBody());
		return out.getBody();
	}
	
	
	
	
	
	
	
	
	
	

	/*@CrossOrigin(origins = "*")
	   @RequestMapping(value = "/userlisttwo", method = RequestMethod.POST)
	   public  Map<String, Object> userlist(@RequestBody User user,
	           HttpServletRequest request, HttpServletResponse response) {
		  System.out.println("inside userlist..userlisttwo==================================================");
	       response.setContentType("application/json");
	       response.setStatus(HttpServletResponse.SC_OK);
	       response.setStatus(200);
	       Map<String, Object> map = null;
	       map = new HashMap<String, Object>();
	       try {
	    	   HashMap m=new HashMap<>();
	    	   m=	   getEmployee();
	    	   
	    	   for(int i=0;i<100;i++) {
	    	   m=	   getEmployee();
	    	   }
	    	   
	    	   
	               map.put("Success", false);
	               map.put("Message", "no list is there");
	               map.put("userlist",m.get("userlist"));
	               return map;
	           
	           

	       } catch (Exception e) {
	           e.printStackTrace();
	           map.put("Success", false);
	           map.put("Message", "error occured");
	           return map;
	       }

	   }
	
	
	
	public HashMap getEmployee() throws RestClientException, IOException {
		//System.out.println("insied metod");
		
		List<ServiceInstance> instances = discoveryClient.getInstances("EurekaZuul");
		System.out.println("instances  "+instances.size());
		ServiceInstance serviceInstance = instances.get(0);
		System.out.println("serviceInstance   "+serviceInstance.getServiceId());
		
//ServiceInstance serviceInstance=loadBalancer.("EurekaZuul");
		
		System.out.println(serviceInstance.getMetadata());
		
		String baseUrl=serviceInstance.getUri().toString();
		
		System.out.println("baseUrl  "+baseUrl);
		
		List<ServiceInstance> instances=discoveryClient.getInstances("EurekaClientOne");
		System.out.println("instances size "+instances.size());
		ServiceInstance serviceInstance=instances.get(0);
		System.out.println("serviceInstance   "+serviceInstance.getHost());
		System.out.println("serviceInstance   "+serviceInstance.getPort());
		System.out.println("serviceInstance   "+serviceInstance.getUri());
		System.out.println("serviceInstance   "+serviceInstance.getMetadata());
		
		//String baseUrl=serviceInstance.getUri().toString();
		
		//System.out.println("baseUrl  "+baseUrl);

		//String baseUrl = "http://localhost:9010/clientone/userlist";
		
		RestTemplate restTemplate = new RestTemplate();
	
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		
		User u=new User();
		String a=baseUrl+"/EurekaClientOne/clientone/userlist";
		System.out.println("a  "+a);
		
		HttpEntity entity = new HttpEntity(u,headers);
		
		ResponseEntity<HashMap> out = restTemplate.exchange(baseUrl+"/EurekaClientOne/clientone/userlist", HttpMethod.POST, entity
			    , HashMap.class);

		//System.out.println("response==================  "+ out.getBody().get("Success"));
		//System.out.println("response==================  " +out.getBody());
		return out.getBody();
	}
	
	
	*/
	/*public HashMap getEmployee() throws RestClientException, IOException {
		System.out.println("insied metod");
		
		
		List<ServiceInstance> instances=discoveryClient.getInstances("EurekaClientOne");
		System.out.println("instances size "+instances.size());
		ServiceInstance serviceInstance=instances.get(0);
		System.out.println("serviceInstance   "+serviceInstance.getHost());
		System.out.println("serviceInstance   "+serviceInstance.getPort());
		System.out.println("serviceInstance   "+serviceInstance.getUri());
		System.out.println("serviceInstance   "+serviceInstance.getMetadata());
		
		String baseUrl=serviceInstance.getUri().toString();
		
		System.out.println("baseUrl  "+baseUrl);

		//String baseUrl = "http://localhost:9010/clientone/userlist";
		
		RestTemplate restTemplate = new RestTemplate();
	
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		
		User u=new User();
		
		HttpEntity entity = new HttpEntity(u,headers);
		
		ResponseEntity<HashMap> out = restTemplate.exchange(baseUrl+"/clientone/userlist", HttpMethod.POST, entity
			    , HashMap.class);

		System.out.println("response==================  "+ out.getBody().get("Success"));
		System.out.println("response==================  " +out.getBody());
		return out.getBody();
	}
	
	*/
	
	/*public HashMap getEmployee() throws RestClientException, IOException {
		System.out.println("insied metod");

		String baseUrl = "http://localhost:9010/clientone/userlist";
		
		RestTemplate restTemplate = new RestTemplate();
	
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		
		User u=new User();
		
		HttpEntity entity = new HttpEntity(u,headers);
		
		ResponseEntity<HashMap> out = restTemplate.exchange(baseUrl, HttpMethod.POST, entity
			    , HashMap.class);

		System.out.println("response==================  "+ out.getBody().get("Success"));
		System.out.println("response==================  " +out.getBody());
		return out.getBody();
	}
	
	*/

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
	

}
