
public class Buburuza extends Insecta{
	
	private int k = printInit("buburuza initializat");
	private int g = printCeva("Buburuza");
	private String nume;
	
	public Buburuza( String nume) {
		this.nume = nume;
		System.out.println("Numele buburuzei este: " + nume + " k = " + k);
	}
	
	public static int x3 = printInit("static Buburuza.x3 initializat");
	
	
	public static void main(String[] args) {
		
	}

}
