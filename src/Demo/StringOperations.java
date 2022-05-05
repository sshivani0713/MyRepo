package Demo;

public class StringOperations {
	
	public static void main(String args[]) {
	
String var_1 = "string Function Program";
String var_2 = "STRING Function";
	

System.out.println("String operations are :");

System.out.println(var_1.charAt(1)); // displays character

System.out.println(var_1.codePointAt(1)); 

System.out.println(var_1.codePointBefore(1));

System.out.println(var_1.codePointCount(0, 5)); // no. of unicoded characters

System.out.println(var_1.compareTo(var_2));

System.out.println(var_1.compareToIgnoreCase(var_2));

System.out.println(var_1.concat(var_2));

System.out.println(var_1.contains(var_2));

System.out.println(var_1.contentEquals(var_2));
		
System.out.println(var_1.endsWith("gram"));

System.out.println(var_1.equalsIgnoreCase(var_2));

System.out.println(var_1.indexOf("Program"));

System.out.println(var_1.isEmpty());



	}
	
}
