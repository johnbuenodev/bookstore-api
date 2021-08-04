package com.example.demo.categoria.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.categoria.domain.Categoria;
import com.example.demo.categoria.service.CategoriaService;
import com.example.demo.dtos.CategoriaDTO;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable long id){
		
		Categoria obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	@GetMapping
	public ResponseEntity<List<CategoriaDTO>> findAllCategoria(){
		
		List<Categoria> list = service.findAllCategoria();
		List<CategoriaDTO> listDTO = list.stream().map(obj -> new CategoriaDTO(obj)).collect(Collectors.toList());
		
		
		return ResponseEntity.ok().body(listDTO);
		
		
	}
	
	
}
