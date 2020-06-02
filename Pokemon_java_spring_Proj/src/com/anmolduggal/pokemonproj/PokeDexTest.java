package com.anmolduggal.pokemonproj;

public class PokeDexTest {

	public static void main(String[] args) {
		Pokemon mew = new Pokemon("Mew", 400, "Psychic");
		Pokemon zaptos = new Pokemon("Zaptos", 350, "Electric");
		mew.attackPokemon(zaptos);
		
		PokeDex testPokeDex = new PokeDex();
		testPokeDex.createPokemon("Pikachu", 100, "Electric");
		testPokeDex.createPokemon("Charizard", 300, "Fire");
		testPokeDex.createPokemon("MewTwo", 100, "Psychic");
		testPokeDex.listPokemon();
		
	}

}
