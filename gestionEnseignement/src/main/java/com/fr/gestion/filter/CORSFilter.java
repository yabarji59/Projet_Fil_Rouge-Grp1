package com.fr.gestion.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter implements Filter{
	
	public static String VALID_METHODS = "DELETE, HEAD, GET, OPTIONS, POST, PUT";
	
	 

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	 HttpServletRequest httpReq = (HttpServletRequest) request;
    HttpServletResponse httpResp = (HttpServletResponse) response;

    // No Origin header present means this is not a cross-domain request
    String origin = httpReq.getHeader("Origin");
     if (origin == null) {
        // Return standard response if OPTIONS request w/o Origin header
       if ("OPTIONS".equalsIgnoreCase(httpReq.getMethod())) {
            httpResp.setHeader("Allow", VALID_METHODS);
            httpResp.setStatus(200);
            return;
        }
    } else {
    	// This is a cross-domain request, add headers allowing access
        httpResp.setHeader("Access-Control-Allow-Origin", origin);
        httpResp.setHeader("Access-Control-Allow-Methods", VALID_METHODS);

        String headers = httpReq.getHeader("Access-Control-Request-Headers");
        if (headers != null)
            httpResp.setHeader("Access-Control-Allow-Headers", headers);

        // Allow caching cross-domain permission
        httpResp.setHeader("Access-Control-Max-Age", "3600");
    }
    // Pass request down the chain, except for OPTIONS
    if (!"OPTIONS".equalsIgnoreCase(httpReq.getMethod())) {
        chain.doFilter(request, response);
    }
	}

}
