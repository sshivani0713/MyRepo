package Demo;

import java.util.Scanner;

public class FactorialProgram {
	static int num1=1;
	public static void fact(int n) {
		for (int i=1;i<=n;i++) {
			System.out.println("the number is" + (num1));	
		num1=num1 * i;
		//fact(n-1);
		
		System.out.println("the after number is"+ (num1));
		}
		//System.out.println("the number is" + (num1));
	}
	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		FactorialProgram fac = new FactorialProgram();
//		int num;
//		System.out.println("Enter a number for which factorial is to be calculated");
//		num=sc.nextInt();
//		fac.fact(num);
		
	
		
	//}
}
