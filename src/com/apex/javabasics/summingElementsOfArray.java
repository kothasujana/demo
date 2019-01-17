package com.apex.javabasics;

public class summingElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int om[] = {21,22,33,24,25,65};
		int sum =0;
		
		for(int i =0; i <om.length ; i++) {
			
			sum+=om[i];
			
		}
		
		System.out.println("sum of the elements is " + sum);
		
		
		
	}

}
