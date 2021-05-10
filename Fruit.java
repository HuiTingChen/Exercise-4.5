package AbstractInterface;

public abstract class Fruit {
	protected String name;
	
	public Fruit(String n) { //constructor with 1 argument	
		name = n;
	}
	
	public String getName() {
		return name;
	}	
	
	
	//define abstract that only have heading with no body
	//define abstract that only have heading with no body
	public abstract double total(); 
	public abstract double total(double pp); 
	public abstract double total(double dis, double pp);
	public abstract String toString();
}
