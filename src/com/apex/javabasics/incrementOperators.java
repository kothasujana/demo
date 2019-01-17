package com.apex.javabasics;

import java.util.Scanner;

public class incrementOperators {
	public static void main(String[] args) {
	
	Scanner bucky = new Scanner(System.in);
	int tuna = 5;
	int bass = 10;
	//to add the number automatically
	System.out.println(++tuna);
	System.out.println(tuna++);
	System.out.println(tuna);
	System.out.println("************DECREMENT******************");
	System.out.println(--tuna);
	System.out.println(tuna--);
	System.out.println(tuna);
	System.out.println("***********assignment operator***********");
	 tuna += 8;
	 System.out.println(tuna +" after assignment operator");
	
	
	
	}
	
	
	

}
