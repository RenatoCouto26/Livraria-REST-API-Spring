package com.restapi.projeto.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.projeto.autor.Autor;
import com.restapi.projeto.autor.AutorDTO;
import com.restapi.projeto.autor.AutorRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/autor")
public class AutorControler {
	
	@Autowired
	private AutorRepository repository;
	
	@PostMapping("/cadastrar")
	@Transactional // por ser um metodo de escrita é importante ter uma transação ativa no BD 
	public void cadastrarAutor(@RequestBody @Valid AutorDTO autorDTO ) {
		repository.save(new Autor(autorDTO));
	}
	
	
	@GetMapping("/listar")
	public List<AutorDTO> listaAutorNome(){
		return repository.findAll().stream().map(AutorDTO::new).toList();
	}

}
