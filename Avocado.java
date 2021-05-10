package AbstractInterface;

import java.text.DecimalFormat;

public class Avocado extends Fruit {
	private static DecimalFormat df2 = new DecimalFormat("#,###,###,###.##"); //for setting 2 decimal places
	private String type;
	private double price;
	private double fats;
	private double weight;
	private boolean heart_healthy;
	
	public Avocado(String n, String t, double p, double f, double w, boolean h){ //constructor with argument	
		super(n);// inherit data from super class with 1 parameter
		type = t;
		price = p;
		fats = f;
		weight = w;
		heart_healthy = h;
		
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
			Discount av = new AvocadoDiscount(); // create a new object 
			double dis = av.disRate(); //daily discount rate
			total(dis, pp); //overloading with 2 arguments
			System.out.println("Fruit Name: " + name);
			System.out.println("If purchased quantity MORE than 10kg, Total price: RM" + df2.format(total(dis,pp)));
			System.out.println("Daily rate of discount: " + av.disRate() + "%"); //calling for discount rate 
		
		}
		
		if (this.type.equals("Florida")) {
			double ff = 0.153;
			System.out.println("The " + this.type + " avocado's fats amount for " + weight + "g is " + totalFats(ff) + ".");
		}
		else if (this.type.equals("Hass")) {
			double ff = 0.195;
			double times = 1.18;
			System.out.println("The " + this.type + " avocado's fats amount for " + weight + "g is " + totalFats(ff,times) + ".");
		}
		else 
			System.out.println("The " + this.type + " avocado's fats amount for " + weight + "g is " + totalFats() + ".");
		
	}
	
	public String getType() {
		return type;
	}
	
	public double getprice() {
		return price;
    }
	
	public double getFats() {
		return fats;
	}
	  
	public double getWeight() {
		return weight;
	}
	
	public boolean getCompare() {
		return heart_healthy;
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
	
	public double totalFats() {
		return fats * weight;
	}
	
	public double totalFats(double ff) {
		return fats * weight;
	}
	
	public double totalFats(double ff,double times ) {
		return fats * weight * times;
	}
	
	public String toString() { //overriding method
		return "Is avocado contain heart healthy fatty acid? " + heart_healthy ;
		  	   
	}
}