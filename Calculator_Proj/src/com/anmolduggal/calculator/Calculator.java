package com.anmolduggal.calculator;

import java.util.ArrayList;

public class Calculator {
	private Double operandOne;
	private String operation;
	private Double operandTwo;
	private ArrayList<Double> doubleList = new ArrayList<Double>();
	private ArrayList<String> stringList = new ArrayList<String>();
	private ArrayList<String> list =  new ArrayList<String>();


	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public double performOperation() {
		
		System.out.println(this.operandOne + this.operation + this.operandTwo);
		if (this.operation == "+") {
			return this.operandOne + this.operandTwo;
		}
		else if (this.operation == "-") {
			return this.operandOne - this.operandTwo;
		}
		
		else {
			System.out.println("Error");
			return 0.0;
		}
		
	}
	
	public void getResult() {
		System.out.println(this.performOperation());
	}
	
	
	public void performOperation(String operation) {
		if (operation == "+" || operation =="-" || operation =="*" || operation == "/" || operation == "=") {
			this.stringList.add(operation);
			this.list.add(operation);
		}
	}
	
	public void performOperation(Double operand) {
		this.doubleList.add(operand);
		this.list.add(Double.toString(operand));
	}
	

	public void getResults() {
		Double x = 0.0;
		
		for(int i=0; i< this.stringList.size();i++)  {
			if (stringList.get(i)=="/") {
				x = doubleList.get(i)/doubleList.get(i+1);
				doubleList.set(i+1, x);
				doubleList.remove(i);
			}
		}
		for(int i=0; i< this.stringList.size();i++) {
			if (stringList.get(i)=="*") {
				x = doubleList.get(i)*doubleList.get(i+1);
				doubleList.set(i+1, x);
				doubleList.remove(i);
			}
		}
		for(int i=0; i< this.stringList.size();i++) {
			if (stringList.get(i)=="+") {
				x = doubleList.get(i)+doubleList.get(i+1);
				doubleList.set(i+1, x);
				doubleList.remove(i);
			}
		}
		for(int i=0; i< this.stringList.size();i++) {
			if (stringList.get(i)=="-") {
				x = doubleList.get(i)-doubleList.get(i+1);
				doubleList.set(i+1, x);
				doubleList.remove(i);
			}
		}
		System.out.println(x);
		
	}
	
}
