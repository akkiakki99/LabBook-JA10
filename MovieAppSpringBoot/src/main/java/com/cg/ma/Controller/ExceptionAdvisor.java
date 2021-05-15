package com.cg.ma.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.ma.exception.MovieApplicationException;

@RestControllerAdvice
public class ExceptionAdvisor {
	
	/* 
	 * For Movie Exception 
	 */

	@ExceptionHandler(MovieApplicationException.class)
	public ResponseEntity<String> handleOFDAExceptionAction(MovieException excep) {
		return new ResponseEntity<>(excep.getMessage(), HttpStatus.BAD_REQUEST);
	}

	/* 
	 * For internal server error 
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleExceptionAction(Exception excep) {
		return new ResponseEntity<>(excep.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
