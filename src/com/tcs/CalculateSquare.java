package com.tcs;

import java.util.Scanner;

public class CalculateSquare {
	
	
public int numberSquare(int num, int result) {
		
		
		result=num*num;
		
		return result;

}
public static void main(String args[]) {
	
	
	CalculateSquare square = new CalculateSquare();
	int number,result = 0;
	Scanner sc = new Scanner(System.in);
	//cube.numberCube(int num, int result);
	System.out.println("Enter the number for which cube is to be calculated");
	int num=sc.nextInt();
	int res=square.numberSquare(num,result);
	System.out.println("The output is :"+res);
	
}

}

