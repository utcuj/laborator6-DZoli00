class Insecta {
	private int i = 9;
	protected int j;

	Insecta() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}

	private static int x1 = printInit("static Insecta.x1 initializata");

	static int printInit(String s) {
		int a = 3;
		a = a + 3;
		System.out.println(s);
		return a;
	}
	
	static int printCeva(String ss) {
		System.out.println(ss+ " este mare");
		return 101;
	}
}