package com.anmolduggal.phone_proj;

public class Galaxy extends Phone implements Ringable{
	
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        System.out.println("Galaxy " + this.getVersionNumber() + " says " + this.getRingTone());
        return "Galaxy " + this.getVersionNumber() + " from " + this.getCarrier();
    }
    @Override
    public String unlock() {
    	System.out.println("Unlocking via facial recognition");
        return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
    	System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());  
    }

}
