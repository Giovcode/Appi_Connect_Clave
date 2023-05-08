package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import entity.Usuario;
import repository.UsuarioRepository;

@Service
public class Logica {
	
	@Autowired
	UsuarioRepository DataBaseConnect;
	
	@Autowired
	CorreoService SystemSendMail;
	
	public boolean Validar(String correo) {
		List<Usuario> Encontrar = DataBaseConnect.findByCorreo(correo);
		return !Encontrar.isEmpty();
	}
	
	public ResponseEntity<?> logica(String correo) {
		boolean envio = Validar(correo);
		
		if (envio) {
			System.out.println("Envio de Prueba");
			return new ResponseEntity<>("Enviado", HttpStatus.OK);
		}else {
			System.out.println("No Existe");
			return new ResponseEntity<>("Sin Exito", HttpStatus.BAD_REQUEST);
		}
	}
}
