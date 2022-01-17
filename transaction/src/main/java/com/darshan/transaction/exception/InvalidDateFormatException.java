package com.darshan.transaction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidDateFormatException extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidDateFormatException(String message) {
		super(message);
	}

}
