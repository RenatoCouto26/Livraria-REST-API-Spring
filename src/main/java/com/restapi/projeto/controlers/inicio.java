package com.restapi.projeto.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class inicio {
	
	@GetMapping("/mensagem")
	public String mensagem() {	
		return "mensagem de teste enviada pelo controler!!!!!";
	}

}
