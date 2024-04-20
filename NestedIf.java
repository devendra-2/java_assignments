package basicprograms;

public class NestedIf {

	public static void main(String[] args) {
		int a = 2;
		if (a < 10) {
			System.out.println("a is less than 10");
			if (a > 10) {

				System.out.println("a is less than 5");
			} else {
				System.out.println("a is greater than 9");
			}
		}

	}

}
