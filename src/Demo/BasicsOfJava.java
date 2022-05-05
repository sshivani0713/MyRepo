package Demo;

import java.util.Scanner;

public class BasicsOfJava {
	
	
	public static void main (String args[]) {
		
		//System.out.println("Hello World");
		BasicsOfJava bj = new BasicsOfJava();
	int num1,num2 ;
	Scanner sc= new Scanner(System.in);
	//System.out.println("First");
	num1=sc.nextInt();
	//System.out.println("second");
	num2=sc.nextInt();
	System.out.println("the result of sum is :"+ (num1+num2));
	System.out.println("The sum is : "+(bj.sum(74,36)));

}
	

	public int sum(int i, int j) {
		int c = i+j;// TODO Auto-generated method stub
		return c;
	}
	

}