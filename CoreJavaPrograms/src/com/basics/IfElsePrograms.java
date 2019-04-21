package com.basics;

public class IfElsePrograms {

	public static void main(String[] args) {
		/*if(false){
			System.out.println("R");
		}else{
			System.out.println(0);
		}*/
		
		int mathScore = 30;
		
		if(mathScore < 30){
			System.out.println("Boss you've failed.. pls try again");
		}else if(mathScore >= 30 && mathScore < 50){
			System.out.println("Grade C");
		}else if(mathScore >= 50 && mathScore < 80){
			System.out.println("Grade B");
		}else if(mathScore >= 80 && mathScore <=100 ){
			System.out.println("Grade A");
		}
		
	}

}
