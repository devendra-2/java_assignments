package basicprograms;

public class Ptacrice {
	void substract() {
		System.out.println("sampa");
	}

	public static void add() {
		System.out.println("panshu");
	}

	public static void EvenOrOdd(int a) {
		if (a % 2 == 0) {
			System.out.println("It is Even");
		} else {
			System.out.println("It is Odd");
		}
	}

	public static void main(String[] args) {

		add();
		Ptacrice P1 = new Ptacrice();
		 P1.substract();
		P1.EvenOrOdd(5);

	}

}
