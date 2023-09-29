package com.ApiRestPokemon.apiRestPokemon.controller;

import com.ApiRestPokemon.apiRestPokemon.models.Pokemon;
import com.ApiRestPokemon.apiRestPokemon.repository.PokemonRepository;
import com.ApiRestPokemon.apiRestPokemon.service.PokemonService;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;
    @Autowired
    private PokemonService pokemonService;



    @GetMapping("/pokemon")
    public ResponseEntity<List<Pokemon>> getPokemonInRadius(
            @RequestParam Double latitud,
            @RequestParam Double longitud,
            @RequestParam Integer radio) {

        if (latitud == null || longitud == null || radio == null) {
            return ResponseEntity.badRequest().build();
        }

        List<Pokemon> pokemons = pokemonService.findPokemonInRadius(latitud, longitud, radio);
        return ResponseEntity.ok(pokemons);
    }


    @PostMapping("/pokemon/{id}")
    public ResponseEntity<?> postPokemon (@PathVariable("id") Long id){
        return ResponseEntity.ok("Has solicitado la información del pokemon con ID "+id);

    }




}
