package paquete_walter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

	@GetMapping("/")
	public String Este() {	
	
		return ("hola mundo html desde otro proyecto");
}

}