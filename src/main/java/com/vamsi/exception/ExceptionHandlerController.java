package com.vamsi.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

	private Log logger = LogFactory.getLog(Exception.class);
	
	@ExceptionHandler(value=Exception.class)
	private String handleException(HttpServletRequest request, Exception ex){
		
		logger.error("Request"+request.getRequestURL(), ex);
		return "error";
	}
	
	
	public void test(){
		
	}
	
}
