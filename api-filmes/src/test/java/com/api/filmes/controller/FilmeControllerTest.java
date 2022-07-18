package com.api.filmes.controller;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import com.api.filmes.model.Filme;
import com.api.filmes.service.FilmeService;

import io.restassured.http.ContentType;

@WebMvcTest
public class FilmeControllerTest {

	@Autowired
	private FilmeController filmeController;

	@MockBean
	private FilmeService filmeService;
	
	@BeforeEach  //antes de cada teste
	public void setup() {
		standaloneSetup(this.filmeController);
	}
	
	@Test
	public void teste() {
		org.junit.jupiter.api.Assertions.assertTrue(true);
	}
	
	@Test
	public void deveRetornarSucesso_QuandoBuscarFilme() {
		
		
		when(this.filmeService.obterFilme(1L))
		.thenReturn(new Filme(1L, "O Poderoso Chefão", "Sem Descrição"));
		
		given()
		.accept(ContentType.JSON)
		.when()
		.get("/filmes/{codigo}", 1L)
		.then()
		.statusCode(HttpStatus.OK.value());
	}
}
