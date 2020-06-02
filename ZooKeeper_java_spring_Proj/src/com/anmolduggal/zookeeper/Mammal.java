package com.anmolduggal.zookeeper;

public class Mammal {
	private int energyLevel = 100;

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energylevel) {
		this.energyLevel = energylevel;
	}
	
	public int displayEnergy() {
		System.out.print(this.getEnergyLevel());
		return this.getEnergyLevel();
	}
	

}
