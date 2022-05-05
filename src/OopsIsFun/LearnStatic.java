package OopsIsFun;

public class LearnStatic {

public static void main (String args[]) {
		
		
		Student.school="ABS";
	}
	//those variables and those methods which are common for class
	//access by classname.
//ex ek student hai uska school ka naam same hoga for all students
//variable,function,block,nested classes ke andr use kr skte h
//jab bhi memory bachaani hai or common variable hai to hm static use krte h
	
}

class Student{
	static String school;
	String name;
	
	public static void changeSchool(){
		
		school="newschool";
		
	}
	
}




