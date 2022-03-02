package com.example.demo.exceptionfamily;


import java.util.List;

@SuppressWarnings("serial")
public class BrandChannelException extends Exception {
	private List<String> errors;
	public BrandChannelException(List<String> errorMessages)
	{this.errors=errorMessages;}
	public List<String> getErrorMessages()
	{
		return errors;
	}

}
