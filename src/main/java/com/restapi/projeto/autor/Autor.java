package com.restapi.projeto.autor;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name ="autor")
@Entity(name="Autor")

//anotações do lombok
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Autor {

	public Autor() {
	}
	
	public Autor(AutorDTO autorDTO) {
		this.nome=autorDTO.nome();
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	

}
