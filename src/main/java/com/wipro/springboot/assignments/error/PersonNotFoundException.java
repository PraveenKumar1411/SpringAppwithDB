package com.wipro.springboot.assignments.error;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.DefaultResponseErrorHandler;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "video not found")
public class PersonNotFoundException extends RuntimeException {
	
}