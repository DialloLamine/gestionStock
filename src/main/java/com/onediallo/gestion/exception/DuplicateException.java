package com.onediallo.gestion.exception;

/**
 * 
 * @author Didier Exception g�n�r�e en cas de cr�ation d'un �l�ment en double.
 *         Cette exception h�rite de RuntimeException, de ce fait, on n'est pas
 *         obliger d'utiliser un try catch
 */
public class DuplicateException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DuplicateException(String msg) {
		super(msg);
	}

}
