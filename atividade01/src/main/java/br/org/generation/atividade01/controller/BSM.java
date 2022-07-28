package br.org.generation.atividade01.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSM {

	@GetMapping
	public ArrayList<String> bsm() {

		String bsm1 = "Orientação ao Futuro";
		String bsm2 = "Responsabilidade Pessoal";
		String bsm3 = "Mentalidade de crescimento";
		String bsm4 = "Persistência";
		String bsm5 = "Trabalho em equipe";
		String bsm6 = "Atenção aos detalhes";
		String bsm7 = "Proatividade";
		String bsm8 = "Comunicação";

		ArrayList<String> listaBSMs = new ArrayList<>();
		listaBSMs.add(bsm1);
		listaBSMs.add(bsm2);
		listaBSMs.add(bsm3);
		listaBSMs.add(bsm4);
		listaBSMs.add(bsm5);
		listaBSMs.add(bsm6);
		listaBSMs.add(bsm7);
		listaBSMs.add(bsm8);

		return listaBSMs;
	}

}
