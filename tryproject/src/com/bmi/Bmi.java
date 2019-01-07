package com.bmi;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String stop="a";
		boolean s= stop.equals("stop");
		while(true) {
		System.out.print("請輸入體重kg：");
		float w=scanner.nextFloat();
		System.out.print("請輸入身高cm：");
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
