public class Gindac extends Insecta {
	private int k = printInit("Gindac.k initializat");
	private int g = printCeva("Gindac");
	
	public Gindac() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	public void ganString() {
		System.out.println("functia in gandac");
	}

	private static int x2 = printInit("static Gindac.x2 initializat");

	/*public static void main(String[] args) {
		System.out.println("Gindac constructor");
		Gindac b = new Gindac();
		Buburuza c = new Buburuza("Ana");
	}*/
}