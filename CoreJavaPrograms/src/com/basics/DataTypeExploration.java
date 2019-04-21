package com.basics;

public class DataTypeExploration {

	public static void main(String[] args) {
		
		// Exploring Byte Range
		byte numberOfVotes = 127;
		numberOfVotes = (byte) (numberOfVotes + 4);
		System.out.println("value of numberOfVotes = " + numberOfVotes);
		
		/*
		 * Exploring Integer
		 */
		int numberOfVotesInInteger = 127;
		numberOfVotesInInteger = numberOfVotesInInteger + 4;
		System.out.println("value of numberOfVotes = " + numberOfVotesInInteger);
		
		// Exploring Long
		long numberOfVotesInLong = 127;
		numberOfVotesInLong = numberOfVotesInLong + 4;
		System.out.println("value of numberOfVotes = " + numberOfVotesInLong);
		
		// Exploring Double
		double salary = 123456789.87;
		salary = salary + 19877;
		System.out.println(salary);
		// pending exponent
		
		// boolean exploration
		boolean isACOn = false;
		isACOn = true;
		System.out.println(isACOn);
		
		
		
	}

}
