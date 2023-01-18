package com.onediallo.gestion.exception;

public class ImpossibleToDelete extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ImpossibleToDelete(String message) {
		super(message);
	}

}
