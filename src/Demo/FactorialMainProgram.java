package Demo;

import java.util.Scanner;

public class FactorialMainProgram {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		FactorialProgram fac = new FactorialProgram();
		int num;
		System.out.println("Enter a number for which factorial is to be calculated");
		num=sc.nextInt();
		fac.fact(num);
		
	
		
	}

}
