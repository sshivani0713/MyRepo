package OopsIsFun;

public class Inheritance {
	
	
	public static void main(String args[]) {
		
		Triangle t1 = new Triangle();
		t1.Color="red";
		
		
		
		
		
	}

}
//so  as code or methods are used again so its inheritance
class Shape {
	
	String Color;
	
	public void area() {
	System.out.println("display area");
	
	
	
}
}
//single level and multiple inheritance and hybrid inheritance
class Triangle extends Shape {
	
	public void area(int l, int b) {
		System.out.println(1/2*l*b);
}
	
}
class EquilateralTriangle extends Triangle {
	
	public void area(int l, int b) {
		System.out.println(1/2*l*b);
}
}

class Circle extends Shape {
	public void area(int r) {
		System.out.println(3.14* r* r);
}
	
	
}
