package com.tcs.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		int count=0;
		Pattern p= Pattern.compile("is");
		Matcher m=p.matcher("World Environment Day (WED) is fdisfb celebrated annually on 5 June and is the United Nations' principal vehicle for encouraging awareness and action for the protection of the environment. First held in 1974, it has been a platform for raising awareness on environmental issue such as marine pollution, human overpopulation, global warming, sustainable consumption and wildlife crime. World Environment Day is a global platform for public outreach, with participation from over 143 countries annually. Each year, the program has provided a theme and forum for businesses, non government organizations, communities, governments and celebrities to advocate environmental causes.");
		
		
		while(m.find()) {
			count++;
			System.out.println(m.start()+"......."+m.end()+"......"+m.group());
			//start index..end shows end index
			//end() method is implemented to return end+1 index
			//group() method is for searching which digit/alphabet symbol/mail id
			//    /phonenumber got matched the use m.group() method.
				
		}
		System.out.println("Is occured  "+count+" number of times");

	}

}
