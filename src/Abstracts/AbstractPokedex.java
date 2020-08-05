package Abstracts;

import java.util.ArrayList;

import Interfaces.IPokemon;
import Models.Pokemon;

public abstract class AbstractPokedex implements IPokemon {
	
	public ArrayList<Pokemon> listOfPokemon;
	
	public AbstractPokedex() {
		this.listOfPokemon = new ArrayList<Pokemon>();
	}

	public Pokemon createPokemon(String name, Integer health, String type) {
		Pokemon p = new Pokemon(name, health, type);
		listOfPokemon.add(p);
		return p;
	}
	
	public abstract String pokemonInfo(Pokemon pokemon);
	
	public abstract void listPokemon();
}
