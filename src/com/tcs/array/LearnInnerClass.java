package com.tcs.array;

public class LearnInnerClass {
	
	//for security
	//non static nested class
//can be private public protected
	//example operating locker in bank...you need both keys like your key and banks key
	public int a=20;
	private String s="Name";
	
	class Inner{
		
		void display() {
			
			System.out.println("Display inner");
			
		}
		
		public static void main(String[] args) {
			LearnInnerClass l=new LearnInnerClass();
			//use outside object to create inside object
			LearnInnerClass.Inner inner = l.new Inner();
			
			// not only we can write a class inside a class
			//we can also create a class inside a particular block[in method,if block,else block,loop]
			
			//this type of class is known as LocalInnerClass
			//if inside method its is called methodLocalInnerClass - it is sued inside a method only
;		}
		
		
	}
	
}
