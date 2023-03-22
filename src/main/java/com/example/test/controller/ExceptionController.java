package com.example.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler({FileNotFoundException.class}) 
	public ResponseEntity<String> test(final AccessDeniedException e) {
		return ResponseEntity.badRequest().body(e.getMessage());
	}
}

