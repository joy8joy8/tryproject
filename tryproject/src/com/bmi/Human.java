package com.bmi;

public class Human {
	float weight;
	float height;
	
	public Human(float weight,float height) {
	this.weight=weight;
	this.height=height;
	}
	
	public void bmi() {
	float hm=height/100f;
	float a=weight/(hm*hm);
	System.out.println(a);
	
	}
}


/*Scanner sc =new Scanner(System.in); 
Scanner sc2 =new Scanner(System.in); 
String [] name=new String[5]; 
String [] Subject={"���","�^��"}; 
int [] chScore=new int[5]; 
int [] engScore=new int[5]; 
double chAvg=0.0D,engAvg=0.0D; 
double[] avg = new double[5]; 
int[]sum=new int[5]; 
int i; 
System.out.println("�п�J�m�W"); 
for(i=0; i<5 ;i++){ 
name[i] =sc.next(); */