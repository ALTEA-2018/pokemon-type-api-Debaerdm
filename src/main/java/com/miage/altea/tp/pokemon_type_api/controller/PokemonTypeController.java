package com.miage.altea.tp.pokemon_type_api.controller;

import com.miage.altea.tp.pokemon_type_api.bo.PokemonType;
import com.miage.altea.tp.pokemon_type_api.service.PokemonTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/pokemon-types")
public class PokemonTypeController {

    private PokemonTypeService pokemonTypeService;

    public PokemonTypeController(PokemonTypeService pokemonTypeService) {
        this.pokemonTypeService = pokemonTypeService;
    }

    @GetMapping("/")
    public List<PokemonType> getPokemonType(@RequestParam(required = false) Integer id,
                                               @RequestParam(required = false) String name,
                                               @RequestParam(required = false) List<String> types){
        if (id != null) {
            return Collections.singletonList(this.pokemonTypeService.getPokemonTypeById(id));
        } else if (name != null) {
            return Collections.singletonList(this.pokemonTypeService.getPokemonTypeByName(name));
        } else if (types != null && !types.isEmpty()) {
            return this.pokemonTypeService.findPokemonsWithListOfTypes(types);
        }

       return new ArrayList<>();
    }

    public List<PokemonType> getAllPokemonTypes() {
        return this.pokemonTypeService.getAllPokemonTypes();
    }
}
