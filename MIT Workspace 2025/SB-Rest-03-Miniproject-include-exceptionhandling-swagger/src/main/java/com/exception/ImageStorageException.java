package com.exception;

public class ImageStorageException extends RuntimeException{
	
	public ImageStorageException(String message,Throwable throwable) {
		super(message,throwable);
	}
	
	public ImageStorageException(String message) {
		super(message);
	}
	public ImageStorageException() {
	}
	

}
