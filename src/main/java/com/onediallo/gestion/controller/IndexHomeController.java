/**
 * 
 */
package com.onediallo.gestion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DIALLO
 *
 */
@Controller
public class IndexHomeController {
	
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

}
