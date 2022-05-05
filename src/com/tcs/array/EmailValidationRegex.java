package com.tcs.array;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationRegex {
	
	public static void main(String[] args) {
		
		String email ="^[a-z0-9+_.]+@[a-zA-Z0-9+.]+$";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Email");
		String email_id =sc.next();
		
		Pattern p=Pattern.compile(email);
		Matcher m=p.matcher(email_id);
		
		
		if(m.matches()) {
			System.out.println("Email created");	
			
		}else {
			
			System.out.println("Please try again. The email should include at least \n1. one uppercase\n2.one lowercase\n3.one special character\n4.It should be at least 8 character long");		
			
		}
		
		
		
		
		
	}

}
