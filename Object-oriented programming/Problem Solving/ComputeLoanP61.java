package com.example.hridoy;

import java.util.Scanner;

public class ComputeLoanP61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter annual interest rate, e.g. 7.25% :");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.println("Enter number of years as an integer, e.g., 5 : ");
		int numberOfYears = input.nextInt();
		System.out.println("Enter loan amount, e.g., 120000.95 : n" );
		double loanAmount = input.nextDouble();
		double monthlyPayment = loanAmount  * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
		
		

	}

}
