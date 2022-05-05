package com.tcs.array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegularExpression {
	
	
	public static void main(String[] args) {
		
		String pass="[a-z]";
		String input="S";
		
		Pattern p=Pattern.compile(pass);
		
		Matcher m=p.matcher(input);
		
		if (m.matches()) {
			
			
			System.out.println("Matched");
			
		}
		else {
			
			System.out.println("Not Matched");
		}
		
		
		
		
		
	}

}
