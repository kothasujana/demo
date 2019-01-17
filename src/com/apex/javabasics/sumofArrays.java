package com.apex.javabasics;

public class sumofArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int om[] = {22,33,42,55,66,77};
		
		int sum =0;
		
		for(int counter =0; counter < om.length ; counter++) {
			
			
			sum += om[counter];
			
			System.out.println(sum);
		}
		
		System.out.println("sum of this counter is " + sum);
		

	}

}
