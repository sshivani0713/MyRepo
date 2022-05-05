package OopsIsFun;

public class MainClass {
	
	
	public static void main (String args[]) {
		
		
		System.out.println("My name is Shivani");		
		Person p = new Person();
		Developer d = new Developer(24,"Shivani");
		d.walk();
		
		p.age=24;
		p.name="Shivani";
		p.walk(2);
		p.walk();
	}
}
	class Person   {
		
		int age;
		String name;
		
		public Person(int age, String name){
			this();
			age=age;
			name=name;
			
			
		}
		
		public Person() {
			// TODO Auto-generated constructor stub
			
		}

		void walk() {
			System.out.println("My name is :"+name+ "and age is :" +age);
			
			}

			void walk(int a) {
				System.out.println("My name is :"+name+ "and age is :" +age);
				
				}
		
	}

class Developer extends Person  {
		Developer(int age, String Name){
			
			super();
			
			
		}
		
		
	}


