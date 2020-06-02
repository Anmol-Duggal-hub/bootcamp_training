package com.anmolduggal.pokemonproj;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	
	public Pokemon(String name, int health, String type) {
		this.health = health;
		this.name = name;
		this.type = type;
	}
	
	public void attackPokemon(Pokemon target) {
		target.setHealth(target.getHealth()-10);
		
	}

}
