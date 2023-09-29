package com.ApiRestPokemon.apiRestPokemon.service;

import com.ApiRestPokemon.apiRestPokemon.models.Pokemon;
import com.ApiRestPokemon.apiRestPokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;
    //Formula de haversine
    private double haversine(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }

    public List<Pokemon> findPokemonInRadius(Double latitud, Double longitud, int radio) {
        List<Pokemon> allPokemons = pokemonRepository.findAll();

        return allPokemons.stream()
                .filter(p -> haversine(latitud, longitud, p.getLatitud(), p.getLongitud()) <= radio)
                .collect(Collectors.toList());
    }
}
