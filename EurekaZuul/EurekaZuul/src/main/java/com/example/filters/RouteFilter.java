package com.example.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class RouteFilter extends ZuulFilter {

	@Override
	public String filterType() {
		System.out.println("route 1");
		return "route";
	}

	@Override
	public int filterOrder() {
		System.out.println("route 2");
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		System.out.println("route 3");
		return true;
	}

	@Override
	public Object run() {
		System.out.println("route 4");
		System.out.println("Using Route Filter");
		System.out.println("pre 4");
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		System.out.println(
				"Request Method=========> : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
	System.out.println(request.getRemotePort());
	System.out.println(request.getRemoteHost());
		return null;
	}

}
