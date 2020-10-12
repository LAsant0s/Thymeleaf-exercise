package com.assis.atividade.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlador {
	
	@RequestMapping("/")
	public String primeiraPag() {
		return "Pagina1";
	}
	
	@RequestMapping("/pagina2")
	public String segundaPag() {
		return "Pagina2";
	}
	
}
