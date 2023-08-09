package com.tasktracker.test.exception;

public class TaskIDAlreadyExistsException extends RuntimeException {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String message;

		public TaskIDAlreadyExistsException() {}

		public TaskIDAlreadyExistsException(String message)
		{
			super(message);
			this.message = message;
		}
	}
