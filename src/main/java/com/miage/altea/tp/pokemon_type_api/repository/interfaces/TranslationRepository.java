package com.miage.altea.tp.pokemon_type_api.repository.interfaces;

import java.util.Locale;

public interface TranslationRepository {
    String getPokemonName(int id, Locale locale);
}
