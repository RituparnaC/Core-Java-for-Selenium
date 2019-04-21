package com.basics;

public class InterestCalculation {

	public static void main(String[] args) {
		double principle = 1000;
		int timeInYears = 3;
		double interestRate = 7;
		
		double interest = (principle * timeInYears * interestRate) / 100;
		System.out.println(interest);
	}

}
