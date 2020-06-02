package com.anmolduggal.pokemonproj;

import java.util.ArrayList;

public class PokeDex extends AbstractPokemon {
	private ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	
	public PokeDex() {
		
	}
	
	public void listPokemon() {
		for(int i=0; i<this.myPokemons.size(); i++) {
			System.out.println(this.myPokemons.get(i).getName());
		}
	}
	
	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name, health, type);
		this.myPokemons.add(pokemon);
		return pokemon;
	}
}
