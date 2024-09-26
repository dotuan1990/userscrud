package com.example.userscrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
public class MultipleUsersException extends RuntimeException {

	public MultipleUsersException(String message) {
		super(message);
	}
}
