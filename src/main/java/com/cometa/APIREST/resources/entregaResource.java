package com.cometa.APIREST.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cometa.APIREST.repository.entregaRepository;
import com.cometa.APIREST.models.entrega;

@RestController
@RequestMapping(value="/api")
public class entregaResource {

	@Autowired
	entregaRepository EntregaRepository;
	
	@CrossOrigin(origins = "http://localhost:9000")
	@GetMapping("/entregas")
	public List<entrega> listaEntregas(){
		return EntregaRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:9000")
	@GetMapping("/entregas/{id}")
	public List<entrega> listaUmaEntrega(@PathVariable(value="id") long id){
		return EntregaRepository.findById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:9000")
	@PostMapping("/entregas")
	public entrega salvaEntrega(@RequestBody entrega Entrega) {
		return EntregaRepository.save(Entrega);
	}
	
	@DeleteMapping("/entregas/{id}")
	public void DestroiEntrega(@PathVariable(value="id") long id) {
		EntregaRepository.deleteById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:9000")
	@PutMapping("/entregas")
	public entrega atualizaEntrega(@RequestBody entrega Entrega) {
		return EntregaRepository.save(Entrega);
	}
}
