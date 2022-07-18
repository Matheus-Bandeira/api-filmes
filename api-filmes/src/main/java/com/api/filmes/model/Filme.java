package com.api.filmes.model;

public class Filme {

	private Long codigo;
	private String titulo;
	private String descricao;

	public Filme() {
		// TODO Auto-generated constructor stub
	}

	public Filme(Long codigo, String titulo, String descricao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
