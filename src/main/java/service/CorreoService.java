package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CorreoService {

	@Autowired
	JavaMailSender javaMailSender;
	
	public void sendCorreo() {
		SimpleMailMessage mensaje = new SimpleMailMessage();
		mensaje.setFrom("giovanime7@gmail.com");
		mensaje.setTo("giovanime7@gmail.com");
		mensaje.setSubject("prueba");
		mensaje.setText("contenido");
		
		javaMailSender.send(mensaje);
	}
}
