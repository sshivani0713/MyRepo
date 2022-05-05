package Demo;

import java.util.Scanner;

public class ArrayInAscendingOrder {

	public static void main (String args[]) {
		int length;
		int temp;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements of Array");

		length=sc.nextInt();

		int arr[] = new int[length];
		int arrasc[]= new int[length];
		for(int i=0;i<length;i++) {
			System.out.println("Enter the number"+(i+1)+"you want");
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements of array are :");
		sc.close();
		
		for(int i=0;i<length;i++) {
			System.out.println((arr[i]));
			//arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
			if(arr[i] < arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}	
		}
		for(int a : arr) {
			System.out.println("The elements of array in ascending order are" +(a));
			//System.out.println((arr[j]));
			//arr[i]=sc.nextInt();
		}
	}
		
	}
	
	







