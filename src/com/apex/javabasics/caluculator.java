package com.apex.javabasics;

import java.util.Scanner;

public class caluculator {
	
	public static void main(String[] args) {
		
		Scanner bucky = new Scanner (System.in);
		double fnum,snum,answer;
		System.out.println("Enter first num");
		//this is for inputting double values
		fnum = bucky.nextDouble();
		System.out.println("Enter second num");
		snum = bucky.nextDouble();
		answer = fnum+snum;
		System.out.println(answer);
		
	}

}
