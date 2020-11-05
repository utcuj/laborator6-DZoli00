
public class BubuA extends Buburuza{

	public BubuA(String nume) {
		super(nume);
		System.out.println("Subclasa BubuA clasei Buburuza!");
		// TODO Auto-generated constructor stub
	}
	
	public static int x4 =  printInit("static BubuA.x4 initializat");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gindac constructor");
		Gindac b = new Gindac();
		Buburuza c = new Buburuza("Ana");
		BubuA a = new BubuA("Nixon");
		//Gindac b = new Gindac();
		b.ganString();
	}

}
