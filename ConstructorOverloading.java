package basicprograms;

public class ConstructorOverloading {

	ConstructorOverloading(int c) {
		System.out.println("hi");
	}

	ConstructorOverloading(double a) {
		double c = a + 9;
		System.out.println(a);
		System.out.println("the");

	}

	public static void main(String[] args) {
		new ConstructorOverloading(1.2);
		new ConstructorOverloading(1);

	}

}
