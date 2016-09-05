package com.blabs.cartola.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blabs.cartola.entity.Jogador;

public interface JogadorRepository extends CrudRepository<Jogador, Long> {

    List<Jogador> findByLastNome(String nome);
}
