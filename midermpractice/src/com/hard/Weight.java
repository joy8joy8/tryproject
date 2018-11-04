package com.hard;

import java.util.Scanner;

public class Weight {

	float weight;
	float height;
	Scanner scanner=new Scanner(System.in);
	public Weight(float weight,float height) {
		this.weight=weight;
		this.height=height;
	}
    public void bmi() {
    	        	
     	float bmi=weight/(height*height);
    	System.out.printf("%.2f",bmi);
    }
    
}
