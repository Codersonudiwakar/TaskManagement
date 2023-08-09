package com.tasktracker.test.exception;

public class TransactionSystemException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	
	public TransactionSystemException() {}


	public TransactionSystemException(String message) {
		super();
		this.message = message;
	}
	
	
	

}
