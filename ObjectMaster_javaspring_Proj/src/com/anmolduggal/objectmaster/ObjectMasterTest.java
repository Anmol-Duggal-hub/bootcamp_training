package com.anmolduggal.objectmaster;

public class ObjectMasterTest {

	public static void main(String[] args) {
		Samurai hanzo = new Samurai();
		Samurai sozen = new Samurai();
		Ninja sasuke = new Ninja();
		Wizard john = new Wizard();
		john.fireball(sozen);
		sasuke.steal(john);
		sozen.deathBlow(john);
		sasuke.runAway();
		sozen.meditate();
		hanzo.howMany();
		
	}

}
