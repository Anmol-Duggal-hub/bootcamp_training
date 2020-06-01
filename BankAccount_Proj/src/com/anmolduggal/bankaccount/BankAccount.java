package com.anmolduggal.bankaccount;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfBankAccounts;
	private static double totalAmountOfMoney;
	
	

	public double getCheckingBalance() {
		return checkingBalance;
	}


	public double getSavingsBalance() {
		return savingsBalance;
	}
	

	private String generateBankAccount() {
        String NumericString = "0123456789";

        StringBuilder sb = new StringBuilder(5);
        for (int i = 0; i < 10; i++) {
        	int index = (int)(NumericString.length() * Math.random());
        	sb.append(NumericString.charAt(index));
        }
        System.out.println(sb.toString());
        return sb.toString();
	}
	
	public BankAccount() {
		this.accountNumber = this.generateBankAccount();
		numberOfBankAccounts++;
	}
	
	public void deposit(double depositAmount, String accountType) {
		if(accountType == "checking" || accountType == "Checking") {
			this.checkingBalance += depositAmount;
			totalAmountOfMoney+=depositAmount;
		}
		if(accountType == "savings" || accountType == "Savings") {
			this.savingsBalance += depositAmount;
			totalAmountOfMoney+=depositAmount;
		}
	}
	
	public void withdraw(double withdrawAmount, String accountType) {
		if(accountType == "checking" || accountType == "Checking" && this.checkingBalance>0) {
			this.checkingBalance -= withdrawAmount;
			totalAmountOfMoney -= withdrawAmount;
		}
		if(accountType == "savings" || accountType == "Savings" && this.savingsBalance>0) {
			this.savingsBalance -= withdrawAmount;
			totalAmountOfMoney -= withdrawAmount;
		}
	}
	
	public void displayBalance() {
		double totalMoney = this.checkingBalance + this.savingsBalance;
		System.out.println("You have $ " + totalMoney + " in your Bank Account");
		}
	}
	
	

	
	


