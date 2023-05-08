package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.Logica;

@RestController
public class UsuarioController {

	@Autowired
	Logica logica;
	
	@GetMapping("/cambiar")
	public ResponseEntity<?> cambiar(@RequestParam String correo) {
		return logica.logica(correo);
	}
}
