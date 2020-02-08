package com.example.filters;

import com.netflix.zuul.ZuulFilter;

public class PostFilter extends ZuulFilter {

	@Override
	public String filterType() {
		System.out.println("post 1");
		return "post";
	}

	@Override
	public int filterOrder() {
		System.out.println("post 2");
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		System.out.println("post 3");
		return true;
	}

	@Override
	public Object run() {
		System.out.println("post 4");
		System.out.println("Using Post Filter");

		return null;
	}

}
