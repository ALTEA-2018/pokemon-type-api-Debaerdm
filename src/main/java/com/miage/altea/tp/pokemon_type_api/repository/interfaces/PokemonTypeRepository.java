package com.miage.altea.tp.pokemon_type_api.repository.interfaces;

import com.miage.altea.tp.pokemon_type_api.bo.PokemonType;

import java.util.List;

public interface PokemonTypeRepository {
    PokemonType findPokemonTypeById(int id);
    PokemonType findPokemonTypeByName(String name);
    List<PokemonType> findPokemonsWithListOfTypes(List<String> types);
    List<PokemonType> findAllPokemonType();
}
