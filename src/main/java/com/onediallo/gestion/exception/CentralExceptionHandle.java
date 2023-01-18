package com.onediallo.gestion.exception;

import java.util.NoSuchElementException;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

/**
 * @author Didier 
 * Une classe annot�e par @ControllerAdvice permet de fournir pour tous les contr�leurs, 
 *         -des gestions (d�viations) d'exceptions
 *         centalis�es 
 *         -s'assurer que certaines cl�s soient pr�sentes dans
 *         "model" avec @ModelAttribute 
 *         -cr�er des binders pour permettre une
 *         conversion de String vers une classe (ex: reconstruire une date �
 *         partir d'un texte)
 */
@ControllerAdvice
public class CentralExceptionHandle {
	/**
	 * D�viation des exceptions cit�es pour ouvrir une page personnalis�e de type
	 * erreur Comme il n'est pas possible de fournir une Map � cette m�thode, on
	 * doit cr�er un objet "ModelAndView"
	 * 
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler({NoSuchElementException.class, NotExistException.class,DuplicateException.class})
	private ModelAndView generalHandler(HttpServletRequest req, Exception e) {
		ModelAndView m = new ModelAndView();
		m.addObject("exception", e);
		m.addObject("path", req.getRequestURL());
		m.setViewName("error");//nom logique de la page d'erreur
		return m;
	}	
}
