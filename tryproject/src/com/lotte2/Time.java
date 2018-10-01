package com.lotte2;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 22, minute = 15,second=10;
		int all=24*60*60;
		System.out.println(hour*60*60+minute*60+second);
		System.out.print((hour*60*60+minute*60+second)*100/all);
		System.out.println("%");
	}

}
