package com.onediallo.gestion.exception;

//Map cette exception sur une erreur HTTP 404 
//@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "El�ment non trouv� !")
public class NotExistException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	// identifiant de l'objet recherche
	private String code;

	/**
	 * Exception qui indique que l'objet ayant le code indiqu� n'existe pas Le
	 * message par d�faut est une cl� i18n "error.object.notExist"
	 * 
	 * @param code
	 */
	public NotExistException(String code) {
		this("error.object.notExist", code);
	}

	/**
	 * Exception qui indique que l'objet ayant le code indiqu� n'existe pas Le
	 * message
	 * 
	 * @param message
	 * @param code
	 */
	public NotExistException(String message, String code) {
		super(message);
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
