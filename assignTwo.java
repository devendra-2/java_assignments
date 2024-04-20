package basicprograms;

public class assignTwo {
	private void areaoftriangle(int h, int b) {
		int area = h * b;
		System.out.println(area);
	}

	private void Areaofsquare(int b) {
		int area = b * b;
		System.out.println(area);
	}

	private int AreaofRectangle(int l, int h) {
		int a = l * h;
		System.out.println(a);
		return a;
	}

	public static void main(String[] args) {

		assignTwo a1 = new assignTwo();
		int area = a1.AreaofRectangle(5, 2);
		System.out.println(area);
		a1.Areaofsquare(3);

	}

}
