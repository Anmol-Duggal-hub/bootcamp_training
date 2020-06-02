package com.anmolduggal.zookeeper;

public class Bat extends Mammal {
	private int energyLevel = 300;
	
	public Bat() {
		
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(int energylevel) {
		this.energyLevel = energylevel;
	}
	
	public void fly() {
		System.out.println("Silent Death");
		this.setEnergyLevel(this.getEnergyLevel()-50);
	}
	
	public void eatHuman() {
		System.out.println("Slurping of Blood");
		this.setEnergyLevel(this.getEnergyLevel()+25);
	}
	
	public void attackTown() {
		System.out.println("Burning and Screaming");
		this.setEnergyLevel(this.getEnergyLevel()-100);
	}

}
