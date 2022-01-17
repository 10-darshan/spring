package com.darshan.transaction.exception;



import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.darshan.transaction.model.ErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest request) {
		ErrorDetails errorDetails=new ErrorDetails(exception.getMessage(), new Date(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidDateFormatException.class)
	public ResponseEntity<ErrorDetails> handleInvalidDateFormatException(InvalidDateFormatException exception, WebRequest request) {
		ErrorDetails errorDetails=new ErrorDetails(exception.getMessage(), new Date(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception, WebRequest request) {
		ErrorDetails errorDetails=new ErrorDetails("Invalid Arguments Error", new Date(), exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleException(Exception exception, WebRequest request) {
		ErrorDetails errorDetails=new ErrorDetails(exception.getMessage(), new Date(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
