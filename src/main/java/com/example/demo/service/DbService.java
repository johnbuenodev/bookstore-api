package com.example.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.categoria.domain.Categoria;
import com.example.demo.categoria.repository.CategoriaRepository;
import com.example.demo.livro.domain.Livro;
import com.example.demo.livro.repository.LivroRepository;

@Service
public class DbService {
	
	@Autowired
	private CategoriaRepository catRepository;
	
	@Autowired
	private LivroRepository livRepository;
	
	public void instanciaBaseDados() {
		
	Categoria c1 = new Categoria(null, "Informática", "Livros de TI");
	Categoria c2 = new Categoria(null, "Ficção cientifica", "Ficção cientifica");
	Categoria c3 = new Categoria(null, "Biografias", "Biografias");
	
	
	Livro l1 = new Livro(null, "Nodejs p1", "autor1", "Primeiros passos", c1);
	Livro l2 = new Livro(null, "Nodejs p2", "autor1", "intermediario passos", c1);
	Livro l3 = new Livro(null, "Nodejs p3", "autor1", "Avançado passos", c2);
	Livro l4 = new Livro(null, "alien: mar de angustia 2", "James a Moore", "Dentro da nave...", c2);
	Livro l5 = new Livro(null, "alien: Surgido das sombras 1 ", "Tim Lebbon", "Dentro da nave...", c2);
	
	c1.getLivros().addAll(Arrays.asList(l1));
	c2.getLivros().addAll(Arrays.asList(l3,l4,l5));
	
	this.catRepository.saveAll(Arrays.asList(c1,c2,c3));
	this.livRepository.saveAll(Arrays.asList(l1,l2,l3,l4));
    
    }
	
	
}
