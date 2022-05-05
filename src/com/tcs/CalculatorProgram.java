package com.tcs;

import java.util.Scanner;

public class CalculatorProgram {
	
	public static void main(String args[]) {
	
	
	int a,b;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("Enter the operation you want to perform : \n1.Add \n2.Subtract \n3.Multiply \n4.Divide ");
	int num=sc.nextInt();
	System.out.println("Enter the First number");
	a= sc.nextInt();
	System.out.println("Enter the Second number");
	b= sc.nextInt();
	
	if (num==1) {
		System.out.println("The sum of two numbers is :"+ (a+b));		
	} else if(num==2){		
		System.out.println("The subtraction of two numbers is :"+ (a-b));	
	} else if(num==3){		
		System.out.println("The multiply of two numbers is :"+ (a*b));	
	}else if(num==4){		
		System.out.println("The Divide of two numbers is :"+ (a/b));	
	} else {
		System.out.println("The operation number you want to perform doesn't exist");	
		
	}	

}
}
