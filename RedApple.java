package AbstractInterface;

public class RedApple extends Apple  { 
	private boolean sugar;
	
	public RedApple(String n, int q, double p, String clr, String t, boolean s) { //constructor with argument	
		super(n,q,p,clr,t); // inherit data from super class with  parameter
		sugar = true;
		
		Discount r = new RedAppleDiscount(); //create new object
		System.out.println("Discount rate for red apple: " + r.disRate() + "%"); //display new discount rate for red apple

	}
	
	public boolean getsugar() {
		return sugar;
    }
	
	public String toString() { //overriding method
		return super.toString() +
			   "\nIs red apple has higher sugar level compare to green apple? " + sugar;
	}
}
