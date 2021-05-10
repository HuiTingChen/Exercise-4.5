package AbstractInterface;

public class Main {
	public static void main(String[] args) {
		
		Apple objApple = new Apple("Apple", 105,2, "red & green", "sweet");	
		System.out.println(objApple); //calling and print for objApple
		System.out.println();
		
		GreenApple objGApple = new GreenApple("Granny Smith", 8,0.7,"green","sour", true);	
		System.out.println(objGApple); //calling and print for objGApple
		System.out.println();
		
		RedApple objRApple = new RedApple("Fuji", 80,1.59,"red","sweet", true);	
		System.out.println(objRApple); //calling and print for objRApple
		System.out.println();
		
		Lemon objLemon = new Lemon("Lemon", 0.01, 0.53, 340,"peel", true);
		System.out.println(objLemon);
		System.out.println();
		
		Avocado objAvocado = new Avocado("Avocado","Hass",0.02, 0.15, 750, true);
		System.out.println(objAvocado);
		System.out.println();
	}
}
