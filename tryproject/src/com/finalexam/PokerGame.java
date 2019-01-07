package com.finalexam;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
//		for(int i=1;i<=52;i++) {
//			System.out.print(i+" ");
//			if(i%13==0) {
//				System.out.println();
//			}			
//		}		
	Poker poker=new Poker();
		poker.pair();
		int c=random.nextInt(52)+1;
		System.out.println();
		System.out.print(c);
		System.out.println();
		int d=new Random().nextInt(52);
		System.out.print(d);
	}

}
