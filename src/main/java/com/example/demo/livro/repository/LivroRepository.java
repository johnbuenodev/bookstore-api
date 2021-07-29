package com.example.demo.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.livro.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
