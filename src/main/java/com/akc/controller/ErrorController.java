/**
 * 
 */
package com.akc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author juan.ortega
 *
 */
@ControllerAdvice
public class ErrorController {

	public static final String ERROR_VIEW="error/500";
	
	@ExceptionHandler(Exception.class)
	public String showInternalServerError(){
		return ERROR_VIEW;
		
	}
	
	
	
}
