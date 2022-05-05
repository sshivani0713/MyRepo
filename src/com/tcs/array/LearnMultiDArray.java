package com.tcs.array;

public class LearnMultiDArray {
	
	public static void main(String[] args) {
		//one way of declaring array
		int a[][]= {{1,2},{3,4},{5,6}};
		
		
	   System.out.println("Print"+a[1][1]);
		
	   System.out.println("Print full array");

	   for(int i=0;i<=2;i++) {
		   
		  for(int j=0;j<=1;j++) {
			  
			  System.out.println("Print"+a[i][j]);  
			  
			  
			  
		  } 
		   
		   
	   }
	   for(int outerarray[] : a) {
		   for (int innerarray: outerarray) {
			   
			   System.out.println("Printing elements"+innerarray);  
			   
			   
		   }
		   
		   
		   
	   }
	   
	   
	   
		
	}
    

}
