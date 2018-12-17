package com.thd.framework.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.thd.framework.threadpooltest.ThreadLocalContextHolder;
import com.thd.framework.threadpooltest.ThreadPoolFactory;
public class ThreadPoolInitFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println( " filter init ");
		new ThreadPoolFactory();
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("filter...");
		
		//测试ThreadLocal
		Map m = new HashMap();
		m.put("name", "devil13th");
		ThreadLocalContextHolder.setContext(m);
		ThreadLocalContextHolder.setName("devil13th");
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}
