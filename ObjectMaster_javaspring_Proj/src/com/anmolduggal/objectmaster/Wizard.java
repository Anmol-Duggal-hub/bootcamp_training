package com.anmolduggal.objectmaster;

public class Wizard extends Human {
	private int health = 50;
	private int intelligence = 8;
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public Wizard() {
		
	}
	
	public void heal(Human target) {
		target.setHealth(target.getHealth()+this.getIntelligence());
		System.out.println("Heal your soul!");
	}
	
	public void fireball(Human target) {
		target.setHealth(target.getHealth()-this.getIntelligence()*3);
		System.out.println("Burn away in to dust!");
	}
	
	
	
}
