package com.tcs.array;

public class LearnSingleDArray {

	
	public static void main(String[] args) {
		//way to declare array..size is compulsory
		int a[]= new int[5];
		//intialize array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println("Print element" +a[1]);
		
		//other way to declare array
		
		int b[]= {10,20,30,40,50};
		String fruits[]= {"Mango","banana","Orange","Grapes"};
		
		
		for (int i=0;i<fruits.length;i++) {
			
			//System.out.println("Print element        "      +fruits[i]);
			System.out.print(fruits[i]+",");
			
		}
	}
}
