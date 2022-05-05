package com.tcs;

import java.util.Scanner;

public class Typeconversion {
	
	protected static String password = "GsshivanI@0713";
	public static void main(String args[]) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the password");
		String pass=sc.next();
		if (password.equals(pass))
		{
			System.out.println("You are logged in");				
		} else {
			System.out.println("Please try again");
			
		}
		
		
		
		
		
	
	char c = 'A';
	System.out.println(c);
	//byte b = c;
	//short s = b;
	int a = c;
	System.out.println(a);
	long l= a;
	System.out.println(l);
	float f= a;
	System.out.println(f);
	double d= f;
	System.out.println(d);
	
	byte b = (byte) l;
	System.out.println(b);
	
	short s =(short) f;
	System.out.println(f);
	
	float fl= (float) s;
	System.out.println(fl);
	double dl= 34.5678;
	float flt = (float) dl;
	System.out.println(dl);
	System.out.println(flt);
	int in =(int) dl;
	System.out.println(in);
	
	

}
}
