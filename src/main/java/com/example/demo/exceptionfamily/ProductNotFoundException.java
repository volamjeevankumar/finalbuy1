package com.example.demo.exceptionfamily;

import java.lang.String;

@SuppressWarnings("serial")
public class ProductNotFoundException extends Exception {
	public ProductNotFoundException() {
	}

	public ProductNotFoundException(String message) {
		super(message);

	}

}
