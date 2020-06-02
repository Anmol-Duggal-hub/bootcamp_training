package com.anmolduggal.objectmaster;

public class Samurai extends Human{
	private int health = 200;
	public static int count = 0;
	

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public Samurai() {
		count++;
	}
	
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth(this.getHealth()/2);
		System.out.println("One Hit Kill");
	}
	
	public void meditate() {
		this.setHealth(this.getHealth()+this.getHealth()/2);
		System.out.println("That path to wellness is through one's own mind.");
	}
	
	public int howMany() {
		System.out.println("The Samurai Clan has " + count + " Warriors!" );
		return count;
	}
}
