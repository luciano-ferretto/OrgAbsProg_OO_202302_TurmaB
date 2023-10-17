package br.edu.atitus.poo.atitusound.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("status")
public class StatusController {
	
	@GetMapping
	public ResponseEntity<String> getStatus() {
		return ResponseEntity.ok("Aplicação está no AR");
	}
	
	//Exemplo do método HTTP POST
	@PostMapping
	public ResponseEntity<String> postStatus(@RequestBody String entrada) {
		System.out.println(entrada);
		return ResponseEntity.status(HttpStatus.CREATED).body("Objeto criado");
	}

}
