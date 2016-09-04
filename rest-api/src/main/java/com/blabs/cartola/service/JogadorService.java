package com.blabs.cartola.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blabs.cartola.entity.Jogador;

@Service
public class JogadorService {
	
	public Jogador findById(Long id){
		Jogador jogador = new Jogador();
		//procurar jogador no BD ou em memoria.
		return jogador;
	}
	//List<Jogador> jogadores
	public String getAllJogadores(){
		return "https://api.cartolafc.globo.com/atletas/mercado";
	}
	public String salvarEscalacao(){
		//List<Jogador> 
		return "https://api.cartolafc.globo.com/auth/time/salvar";
	}
	public String atualizarNomeTime(){
		return "https://api.cartolafc.globo.com/auth/time";
	}
	public String deletarAlgo(){
		return "Alguma URL que deleta algo";
	}
}
