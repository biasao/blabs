package com.blabs.cartola.entity;

public class Clube {
	private Long id;
	private String nome;
	private String abreviacao;
	
	
	@Override
	public String toString() {
		return "Clube [nome=" + nome + ", toString()=" + super.toString() + "]";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAbreviacao() {
		return abreviacao;
	}
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
	
	
}
