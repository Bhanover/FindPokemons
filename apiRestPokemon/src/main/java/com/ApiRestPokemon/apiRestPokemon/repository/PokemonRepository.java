package com.ApiRestPokemon.apiRestPokemon.repository;

import com.ApiRestPokemon.apiRestPokemon.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon,Long> {

}
