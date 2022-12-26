package com.prowing.ExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandling {
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandle(Exception e) {
		return "exception";
	}
}
