package AbstractInterface;

import java.text.DecimalFormat;

public class Lemon extends Fruit {
	private static DecimalFormat df2 = new DecimalFormat("#,###,###,###.##"); //for setting 2 decimal places
	private double price;
	private double vitaminC;
	private double weight;
	private String form;
	private boolean compare;
	
	public Lemon(String n, double p, double vitC, double w, String f, boolean c) { //constructor with  argument	
		super(n);// inherit data from super class with 1 parameter
		price = p;
		vitaminC = vitC;
		weight = w;
		form = f;
		compare = c;
		
		if (this.weight < 2000) {
			total(); //overloading with no arguments sbb harga dan kuantiti sama/tak berubah
			System.out.println("Fruit Name: " + name);
			System.out.println("If purchased weight LESS than 2kg, Total price: RM" + df2.format(total()));
		
		}
			else if (this.weight > 2000 && this.weight < 10000) {
			double pp = p-0.10; // purchase more than 10 but less than 100, price will deduct 0.10
			total(pp); //overloading with 1 argument
			System.out.println("Fruit Name: " + name);
			System.out.println("If purchased weight BETWEEN 2-10kg, Total price: RM" + df2.format(total(pp)));
		}
		
			else {
			double pp = p-0.20; //purchase more than 100 , price will deduct 0.20
			Discount l = new LemonDiscount(); // create a new object 
			double dis = l.disRate(); //daily discount rate
			total(dis, pp); //overloading with 2 arguments
			System.out.println("Fruit Name: " + name);
			System.out.println("If purchased quantity MORE than 10kg, Total price: RM" + df2.format(total(dis,pp)));
			System.out.println("Daily rate of discount: " + l.disRate() + "%"); //calling for discount rate 
		
		}

		
		if (form.equals("juice")) {
			double vC = 0.053;
			System.out.println("The vitamin c content in " + weight + "g lemon " + form + " is " + totalvitC(vC));
		}
		else if (form.equals("peel")) {
			double vC = 0.043;
			double times = 3;
			System.out.println("The vitamin c content in " + weight + "g lemon " + form + " is " + totalvitC(vC,times));
		}
		else 
			System.out.println("The vitamin c content in " + weight + "g lemon " + form + " is " + totalvitC());
	}
	
	public double getprice() {
		return price;
    }
	
	public double getvitaminC() {
		return vitaminC;
    }
  
    public double getWeight() {
		return weight;
    }
	
    public double totalvitC() {
	    return vitaminC * weight;
    }
    
    public double totalvitC(double vC) {
  	    return vC * weight;
    }
    
    public double totalvitC(double vC,double times) {
  	    return vC * weight * times;
    }
    
    public String getForm() {
		return form;
    }
  
    public boolean getCompare() {
		return compare;
    }
    
    public double total() { //overloading with no parameter
		return weight* price;
	} 
	
	public double total(double pp) { //overloading with 1 parameter
		return weight* pp;
	} 
	
	public double total(double dis, double pp) { //overloading with 2 parameter
		return weight* pp * (1-dis);
	} 
    
    public String toString() { //overriding method
		return  "Is lemon peel has higher vitamin C? " + compare;
	}
}