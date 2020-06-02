package com.anmolduggal.objectmaster;

public class Ninja extends Human{
	private int stealth = 10;

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	public Ninja() {
		
	}
	
	public void steal(Human target) {
		target.setHealth(target.getHealth()-this.getStealth());
		this.setHealth(this.getHealth()+this.getStealth());
		System.out.println("Your soul is mine!");
	}
	
	public void runAway() {
		this.setHealth(this.getHealth()-10);
		System.out.println("RogueCraft: Vanish.");
	}

}
