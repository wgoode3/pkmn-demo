package Models;

import Abstracts.AbstractPokedex;

public class Pokedex extends AbstractPokedex {
	
	public String pokemonInfo(Pokemon pokemon) {
		String toReturn = "";
		toReturn += "Name:   " + pokemon.getName() + "\n";
		toReturn += "Health: " + pokemon.getHealth() + "\n";
		toReturn += "Type:   " + pokemon.getType();
		return toReturn;
	}
	
	public void listPokemon() {
		System.out.println("Printing all " + Pokemon.getPokemonCount() + " pokemon!");
		System.out.println("=================================================");
		for(Pokemon p : listOfPokemon) {
			System.out.println( this.pokemonInfo(p) );
			System.out.println("-------------------------------------------------");
		}
	}
}
