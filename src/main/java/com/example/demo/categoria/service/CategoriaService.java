package com.example.demo.categoria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.categoria.domain.Categoria;
import com.example.demo.categoria.repository.CategoriaRepository;
import com.example.demo.dtos.CategoriaDTO;
import com.example.demo.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository CatRepository;
	
	
	public Categoria findById(Long id) {
		
		Optional<Categoria> obj = CatRepository.findById(id);
		//return obj.orElse(null);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto com id " + id + " não encontrado! " + " Tipo: " + Categoria.class.getName()));
		
	}
	
	public List<Categoria> findAllCategoria(){
		
		return CatRepository.findAll();
		
	}

	
	public Categoria createCategoria(Categoria obj) {
		
		obj.setId(null);

		return CatRepository.save(obj);
		
	}

	public Categoria update(Long id, CategoriaDTO objDTO) {
		
		Categoria obj = this.findById(id);
		obj.setNome(objDTO.getNome());
		obj.setDescricao(objDTO.getDescricao());
		return CatRepository.save(obj); 
		
	}
	
}
