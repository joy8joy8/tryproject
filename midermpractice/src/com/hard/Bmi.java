package com.hard;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Your weight(kg):");
		float a = scanner.nextFloat();
		scanner.nextLine();
		System.out.print("Your height(m):");
		float b = scanner.nextFloat();
		scanner.nextLine();
		Weight w=new Weight(a ,b);	
		w.bmi();
	}
 
}
