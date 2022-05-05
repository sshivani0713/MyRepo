package Banks;

public class Banks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//why this main is public bcz compiler when runs code it checks for it
		Account acc = new Account();
		acc.name="Sid";
		acc.email="sid@gmail.com";
		acc.setPassword("abcd");
		System.out.println(acc.getPassword());

	}

}
class Account{
	
	public String name;
	protected String email;
	private String password;
	
	// to access private things we use getters and setters
	public String getPassword() {
			return this.password;
		
	}
	
    public void setPassword(String pass) {
	     this.password=pass;
	
			}
	
	
	
}