package com.bmi;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String stop="a";
		boolean s= stop.equals("stop");
		while(true) {
		System.out.print("�п�J�魫kg�G");
		float w=scanner.nextFloat();
		System.out.print("�п�J����cm�G");
		float h=scanner.nextFloat();
		Human bmi=new Human(w,h);
		bmi.bmi();
		scanner.nextLine();
		stop=scanner.nextLine();
		if(stop.equals("stop")) {
			break;
		}
		}
		
	}

}
