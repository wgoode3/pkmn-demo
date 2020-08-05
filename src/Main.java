import Models.Pokedex;

public class Main {
	public static void main(String[] args) {
		Pokedex kantoDex = new Pokedex();
		kantoDex.createPokemon("Bulbasaur", 50, "grass / poison");
		kantoDex.createPokemon("Flygon", 80, "ground / flying");
		kantoDex.createPokemon("Squirtle", 50, "water");
		kantoDex.createPokemon("Deino", 45, "dark / dragon");
		kantoDex.listPokemon();
	}
}
