package com.anmolduggal.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator testCalculator = new Calculator();
		testCalculator.performOperation(10.5);
		testCalculator.performOperation("+");
		testCalculator.performOperation(5.2);
		testCalculator.performOperation("*");
		testCalculator.performOperation(10.0);
		testCalculator.performOperation("=");
		testCalculator.getResults();
		
	}

}
