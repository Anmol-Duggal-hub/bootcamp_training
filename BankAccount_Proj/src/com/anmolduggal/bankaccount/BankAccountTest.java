package com.anmolduggal.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankaccount1 = new BankAccount();
		bankaccount1.deposit(100.00, "Checking");
		bankaccount1.withdraw(50.00, "Checking");
		bankaccount1.deposit(200.00, "Savings");
		bankaccount1.withdraw(100.00, "Savings");
		bankaccount1.displayBalance();
		BankAccount bankaccount2 = new BankAccount();
		bankaccount2.deposit(100.00, "Checking");
		bankaccount2.withdraw(50.00, "Checking");
		bankaccount2.deposit(200.00, "Savings");
		bankaccount2.withdraw(100.00, "Savings");
		bankaccount2.displayBalance();
		
	}

}
