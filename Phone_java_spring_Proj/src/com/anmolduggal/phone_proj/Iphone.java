package com.anmolduggal.phone_proj;

public class Iphone  extends Phone implements Ringable {
	
	    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
	        super(versionNumber, batteryPercentage, carrier, ringTone);
	    }
	    @Override
	    public String ring() {
	        System.out.println("IPhone " + this.getVersionNumber() + " says " + this.getRingTone());
	        return "IPhone " + this.getVersionNumber() + " from " + this.getCarrier();
	    }
	    @Override
	    public String unlock() {
	    	System.out.println("Unlocking via finger print");
	        return "Unlocking via finger print";
	    }
	    @Override
	    public void displayInfo() {
	    	System.out.println("IPhone " + this.getVersionNumber() + " from " + this.getCarrier());  
	    }

}
