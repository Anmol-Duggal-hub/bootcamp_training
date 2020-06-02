package com.anmolduggal.zookeeper;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		
	}
	
	public void throwSomething() {
		System.out.println("The Gorilla has thrown something");
		this.setEnergyLevel(this.getEnergyLevel()-5);
	}
	
	public void eatBanana() {
		System.out.println("The Gorilla is happy");
		this.setEnergyLevel(this.getEnergyLevel()+10);
	}
	
	public void climb() {
		System.out.println("The Gorilla has climbed a tree");
		this.setEnergyLevel(this.getEnergyLevel()-10);
	}

}
