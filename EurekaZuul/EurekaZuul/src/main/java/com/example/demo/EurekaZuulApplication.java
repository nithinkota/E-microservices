package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.filters.ErrorFilter;
import com.example.filters.PostFilter;
import com.example.filters.PreFilter;
import com.example.filters.RouteFilter;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulApplication.class, args);
	}
	
	@Bean
    public PreFilter preFilter() {
		System.out.println("============1============");
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
    	System.out.println("============2============");
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
    	System.out.println("============3============");
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
    	System.out.println("============4============");
        return new RouteFilter();
    }
}
