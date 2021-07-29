package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.categoria.domain.Categoria;
import com.example.demo.categoria.repository.CategoriaRepository;
import com.example.demo.livro.domain.Livro;
import com.example.demo.livro.repository.LivroRepository;

@SpringBootApplication
public class BookstoreApplication /*implements CommandLineRunner*/{
	
	/*
	@Autowired
	private CategoriaRepository catRepository;
	
	@Autowired
	private LivroRepository livRepository; */
	

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
		
	}
	
	/*
	@Override
	public void run(String... args) throws Exception{
		Categoria c1 = new Categoria(null, "Informática", "Livros de TI");
		
		Livro l1 = new Livro(null, "Nodejs", "autor1", "Primeiros passos", c1);
		
		c1.getLivros().addAll(Arrays.asList(l1));
		
		
		this.catRepository.saveAll(Arrays.asList(c1));
		this.livRepository.saveAll(Arrays.asList(l1));
		
	} */
	

}
