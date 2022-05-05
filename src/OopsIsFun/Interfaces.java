package OopsIsFun;

public class Interfaces implements Cars{
	
	public static void main (String args[]) {
	
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("AUDI Car has been started");
		
	}
	

}

interface Cars {
	
	
	void start();
		
}
