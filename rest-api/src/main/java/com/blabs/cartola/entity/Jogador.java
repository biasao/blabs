package com.blabs.cartola.entity;

public class Jogador {
	private String nome;
	private Long id;
	private String apelido;
	private Long escalacoes;
	private Clube clube;
	private String posicao;
	
	@Override
	public String toString() {
		return "Jogador [apelido=" + apelido + ", clube=" + clube
				+ ", posicao=" + posicao + ", toString()=" + super.toString()
				+ "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Long getEscalacoes() {
		return escalacoes;
	}
	public void setEscalacoes(Long escalacoes) {
		this.escalacoes = escalacoes;
	}
	public Clube getClube(Long id) {
		return clube;
	}
	public void setClube(Long clubeId) {
		this.clube = null;//finalizar
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	
}
