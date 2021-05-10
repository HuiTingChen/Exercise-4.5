package AbstractInterface;

public class GreenApple extends Apple{
	private boolean makepie;
	
	public GreenApple(String n, int q, double p, String clr, String t, boolean pie) { //constructor with argument	
		super(n,q,p,clr,t); // inherit data from super class with  parameter
		makepie = true;
		 
		Discount g = new GreenAppleDiscount(); //create new object
		System.out.println("Discount rate for green apple: " + g.disRate() + "%"); //display new discount rate for green apple

	}
	
	public boolean getpie() {
		return makepie;
	}
	
	public String toString() { //overriding method
		return super.toString() +
			   "\nIs it suitable for making pie? " + makepie;
	}
}
