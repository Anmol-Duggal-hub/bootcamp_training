package com.anmolduggal.phone_proj;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		Iphone iphoneten = new Iphone("X", 100, "AT&T", "Zing");
		
		s9.displayInfo();
		s9.ring();
		s9.unlock();
		
		iphoneten.displayInfo();
		iphoneten.ring();
		iphoneten.unlock();

	}

}
