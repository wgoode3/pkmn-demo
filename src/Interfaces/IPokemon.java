package Interfaces;

import Models.Pokemon;


public interface IPokemon {

	Pokemon createPokemon(String name, Integer health, String type);
	String pokemonInfo(Pokemon pokemon);
	void listPokemon();
	
}
