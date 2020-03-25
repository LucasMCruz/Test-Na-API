package com.gft.show.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.show.model.Usuario;
import com.gft.show.service.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(tags = "Usuario")
@RestController
@RequestMapping("/api/usuario")
public class ApiUsuario {
	
	@Autowired
	private UsuarioService usuaSe;
	
	
	@ApiOperation("Listar usuarios")
	@GetMapping()
	public ResponseEntity<List<Usuario>> listar(){
		return ResponseEntity.status(HttpStatus.OK).body(usuaSe.listar());
	}
	@ApiOperation("Listar usuarios")
	@GetMapping("/{username}")
	public ResponseEntity<Usuario> Buscar(@PathVariable("username") String username){
		return ResponseEntity.status(HttpStatus.OK).body(usuaSe.buscar(username));
	}

	

}
