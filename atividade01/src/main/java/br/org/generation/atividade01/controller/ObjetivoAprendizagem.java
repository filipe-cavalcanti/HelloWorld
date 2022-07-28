package br.org.generation.atividade01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoAprendizagem {

	@GetMapping
	public String objetivoAprendizagem() {
		return "Aprender a usar o MySQL, Spring Boot e estudar React depois da aula";
	}

}
