package com.example.filters;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter {

	@Override
	public String filterType() {
		System.out.println("error 1");
		return "error";
	}

	@Override
	public int filterOrder() {
		System.out.println("error 2");
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		System.out.println("error 3");
		return true;
	}

	@Override
	public Object run() {
		System.out.println("error 4");
		System.out.println("Using Route Filter");

		return null;
	}

}