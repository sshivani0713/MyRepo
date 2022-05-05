package com.tcs.array;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {
	
	public static void main(String[] args) {
		
		
		String phonenumber="[987]{3}[0-9]{7}";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you phone number");
		String number =sc.next();
		
		Pattern p= Pattern.compile(phonenumber);
		Matcher m=p.matcher(number);
		
		if(m.matches()) {
		System.out.println("Matched");
		
		}
		else {
			System.out.println("Not Matched");
			
		}
		
		
		}
		
		
	}
	
	


