package com.blabs.cartola.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blabs.cartola.service.JogadorService;

@RestController
public class JogadorController {
	
	@Inject
	JogadorService js;
	
	@RequestMapping(method = RequestMethod.GET, value = "/jogador")
	public String getAllJogadores() {
        return js.getAllJogadores();
    }
	@RequestMapping(method = RequestMethod.POST, value = "/jogador/SendTeam")
	public String SalvarEscalacao(){
		return js.salvarEscalacao();
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/jogador/UpdateTeamName")
	public String AtualizarNomeTime(){
		return js.atualizarNomeTime();
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/atletas/DeleteSomeThing")
	public String deletarAlgo(){
		return js.deletarAlgo();
	}
	
}
