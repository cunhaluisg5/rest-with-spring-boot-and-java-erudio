package br.com.erudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMethodOperationException extends RuntimeException{

	public UnsupportedMethodOperationException(String ex) {
		super(ex);
	}

	private static final long serialVersionUID = 1L;

}
