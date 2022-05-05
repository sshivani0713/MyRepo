package OopsIsFun;

public class Abstraction {
	
	public static void main (String args[]) {
		
		AUDI au = new AUDI();
		au.start();
		
		
	}	
		
	}
class AUDI extends car{

		@Override
		void start() {
			// TODO Auto-generated method stub
			System.out.println("AUDI Car has been started");
		}
		
	}
class BMW extends car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW Car has been started");
		
	}
	
	
	
}


abstract class car {
	
	int price;
	abstract void start();
	
	void breaks() {
		
		System.out.println("The breaks are applied");
		
	}
}

	
