package com.api.filmes.service;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.api.filmes.model.Filme;

@Service
public class FilmeService {
	
	ArrayList<Filme> filmes = new ArrayList<>();
	
	@PostConstruct
	public void adicionarFilmes() {
		Filme f1 = new Filme(1L, "O Poderoso Chefão", "Filme norte-americano de 1972, dirigido por Francis Ford Coppola");
		Filme f2 = new Filme(2L, "Matrix","Filme onde máquina vira humano, dirigido por fulano");
		Filme f3 = new Filme(3L, "Procurando nemo", "Filme que conta as aventuras de um peixe");
		
		filmes.add(f1);
		filmes.add(f2);
		filmes.add(f3);
	}

	public Filme obterFilme(Long codigo) {

		if (codigo > 100) {
			return null;
		}

		for (Filme f: filmes) {
			if(codigo == f.getCodigo()) {
				return f;
			}
		}
		
//		return new Filme(1L, "O Poderoso Chefão",
//				"Filme norte-americano de 1972, dirigido por Francis Ford Coppola");
		
		return null;
	}
}
