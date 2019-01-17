package com.apex.javabasics;

public class arrayTable {

	
	public static void main(String [] args) {
		System.out.println("Index\tValue");
		int om[] = {1,2,3,4,5,6,77,88,99};
		
		for (int counter = 0; counter < om.length; counter++) {
			
			// counter refers to index of an anrray and om[counter] is the value of an array
			System.out.println(counter +"\t" +om[counter]);
			
			
		}
		
	}
}
