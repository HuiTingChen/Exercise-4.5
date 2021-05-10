package AbstractInterface;

import java.text.DecimalFormat;

public class Apple extends Fruit{
	private static DecimalFormat df2 = new DecimalFormat("#,###,###,###.##"); //for setting 2 decimal places
	protected int quantity;
	protected double price;
	protected String colour;
	protected String taste;
	
	public Apple(String n, int q, double p, String clr, String t) { //constructor with argument	
		super(n);// inherit data from super class with 1 parameter
		quantity = q;
		price = p;
	    colour = clr;
		taste = t;
		
		if (this.quantity < 10) {
			total(); //overloading with no arguments sbb harga dan kuantiti sama/tak berubah
			System.out.println("Fruit Name: " + name);
			System.out.println("If purchased quantity LESS than 10, Total price: RM" + df2.format(total()));
		
		}
			else if (this.quantity > 10 && this.quantity < 100) {
			double pp = p-0.05; // purchase more than 10 but less than 100, price will deduct 0.05
			total(pp); //overloading with 1 argument
			System.out.println("Fruit Name: " + name);
			System.out.println("If purchased quantity MORE than 10, Total price: RM" + df2.format(total(pp)));
		}
		
			else {
			double pp = p-0.10; //purchase more than 100 , price will deduct 0.10
			Discount a = new FruitDiscount(); // create a new object 
			double dis = a.disRate(); //daily discount rate
			total(dis, pp); //overloading with 2 arguments
			System.out.println("Fruit Name: " + name);
			System.out.println("If purchased quantity MORE than 100, Total price: RM" + df2.format(total(dis,pp)));
			System.out.println("Daily rate of discount: " + a.disRate() + "%"); //calling for discount rate 
		
		}

	}
	
	public int getQuantity() {
		return quantity;
    }
	
	public double getPrice() {
		return price;
    }
	  
	public String getColour() {
		return colour;
    }
	
	public String getTaste() {
		return taste;
    }
	  
	public double total() { //overloading with no parameter
		return quantity* price;
	} 
	
	public double total(double pp) { //overloading with 1 parameter
		return quantity* pp;
	} 
	
	public double total(double dis, double pp) { //overloading with 2 parameter
		return quantity* pp * (1-dis);
	} 
	
	public String toString() { //overriding method
	    return  "Colour             : " + colour + "\n" + 
	    		"Taste              : " + taste;
	}
	
}