package com.apex.javabasics;

import java.util.Random;

public class randomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random dice = new Random();
		
		int number;
		for(int counter = 1; counter<= 10; counter++) {
			
			//it will take 0 to 5  for dice.nextInt(6) because we gave 6 options so if we give 1+ dice.nextInt(6) because it gives illusion 1 to 6 instaed of 0 to 5
			number = 1 + dice.nextInt(6);
			System.out.println(number + " ");
			
		}
		
		
		

	}

}
