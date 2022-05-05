package com.tcs;

import java.util.Scanner;

public class CalculateCube {
	
	//int number;
	//Scanner sc = new Scanner(System.in);
	
	//int num=sc.nextInt();
	//int result=0;
	
	public int numberCube(int num, int result) {
		
		
		result=num*num*num;
		
		return result;
		
		
	}
	
	public static void main(String args[]) {
		
		
		CalculateCube cube = new CalculateCube();
		int number;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		//cube.numberCube(int num, int result);
		System.out.println("Enter the number for which cube is to be calculated");
		int num=sc.nextInt();
		int res=cube.numberCube(num,result);
		System.out.println("The output is :"+res);
		
	}

}
