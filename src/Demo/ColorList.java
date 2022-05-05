package Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class ColorList {
	
	public static void main(String args[]) {
		
		String str1="Yellow";
		String str2="White";
		String str3="Green";
		String str4="Blue";
		
		
		ArrayList<String> ArrList = new ArrayList<String>();	
		ArrList.add(str1);
		ArrList.add(str2);
		ArrList.add(str3);
		ArrList.add(str4);
		
		ListIterator<String> ListIter = ArrList.listIterator();
		
		System.out.println("List before removing element is :" +ArrList);
		
		for(String it : ArrList)
		{
			ListIter.next();
			
			if(it == "Green")
				break;
			
		}
		
		ListIter.remove();
		System.out.println("List after removing element is :" +ArrList);
		System.out.println("Size of List is :" +ArrList.size());
		
		
		
		
	}

}
