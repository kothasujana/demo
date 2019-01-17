package com.apex.javabasics;

import java.util.Random;

public class arrayElementsAsCounters {

	public static void main(String[] args) {
		Random rand =  new Random();
		// though dice has 6 elements we are taking  eements in an array because array index starts from 0 to 6
		int freq[] = new int[7];
		for(int roll =1 ;roll<1000; roll++) {
			++freq[1+rand.nextInt(6)];
			}
	}
	
}
