package com.miage.altea.tp.pokemon_type_api.service;

import com.miage.altea.tp.pokemon_type_api.bo.PokemonType;
import com.miage.altea.tp.pokemon_type_api.repository.PokemonTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonTypeServiceImpl implements PokemonTypeService {

    public PokemonTypeRepository pokemonTypeRepository;

    public PokemonTypeServiceImpl(PokemonTypeRepository pokemonTypeRepository) {
        this.pokemonTypeRepository = pokemonTypeRepository;
    }

    @Override
    public PokemonType getPokemonTypeById(int id) {
        return this.pokemonTypeRepository.findPokemonTypeById(id);
    }

    @Override
    public PokemonType getPokemonTypeByName(String name) {
        return this.pokemonTypeRepository.findPokemonTypeByName(name);
    }

    @Override
    public List<PokemonType> findPokemonsWithListOfTypes(List<String> types) {
        return this.pokemonTypeRepository.findPokemonsWithListOfTypes(types);
    }

    @Override
    public List<PokemonType> getAllPokemonTypes () {
        return this.pokemonTypeRepository.findAllPokemonType();
    }
}