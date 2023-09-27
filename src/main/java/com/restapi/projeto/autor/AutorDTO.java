package com.restapi.projeto.autor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AutorDTO( @NotBlank String nome) {

	public AutorDTO(Autor autor) {
		this(autor.getNome());
		
	}
	
}

