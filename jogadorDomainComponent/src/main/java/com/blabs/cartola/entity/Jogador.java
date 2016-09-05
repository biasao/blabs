package com.blabs.cartola.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nome;
  	private String apelido;
  	private Long escalacoes;
  	private String posicao;

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
    public String getPosicao() {
  		return posicao;
  	}
  	public void setPosicao(String posicao) {
  		this.posicao = posicao;
  	}

    @Override
  	public String toString() {
  		return "Jogador [apelido=" + apelido
  				+ ", posicao=" + posicao + ", toString()=" + super.toString()
  				+ "]";
  	}
}
