package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
@RestController
@AllArgsConstructor
public class UsuarioController {
	@Autowired
	UsuarioRepository repository;
   
	@GetMapping("/usuario/{id}")
	public  Usuario getUsuarioById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@GetMapping("/usuario")
	public List<Usuario> getAllUsuarios() {
		return repository.findAll();
	}
	
	@PostMapping("/usuario")
	public Usuario saveUsuaio(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void deleteUsuario(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
