package com.onediallo.gestion.exception;

public class ImpossobleSuppModuleWithInscriptionException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	// identifiant de l'objet recherche
	private String code;
	
	public ImpossobleSuppModuleWithInscriptionException(String code) {
		this("error.object.del.impossible", code);
	}
	
	
	public ImpossobleSuppModuleWithInscriptionException(String message, String code) {
		super(message);
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

}
