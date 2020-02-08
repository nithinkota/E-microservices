package com.example.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter {

	@Override
	public String filterType() {
		System.out.println("pre 1");
		return "pre";
	}

	@Override
	public int filterOrder() {
		System.out.println("pre 2");
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		System.out.println("pre 3");
		return true;
	}

	@Override
	public Object run() {
		System.out.println("pre 4");
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		System.out.println(
				"Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());

		return null;
	}

}
