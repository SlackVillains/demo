package com.anz.wholesale.demo.exception;

public class TechnicalException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TechnicalException() {
		super("default error");
	}
	
	public TechnicalException(String message) {
		super(message);
	}

}
