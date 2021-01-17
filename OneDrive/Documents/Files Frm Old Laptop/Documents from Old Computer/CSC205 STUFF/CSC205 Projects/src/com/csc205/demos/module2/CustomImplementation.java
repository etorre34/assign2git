package com.csc205.demos.module2;

public class CustomImplementation {

	public void execute() {
		
		
		try {
			throw new CustomException("Hi there!");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
}
