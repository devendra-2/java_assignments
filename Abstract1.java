package basicprograms;

public class Abstract1 extends Abstract {

	@Override
	public void add() {
		System.out.println("hello");
		
	}
	public static void main(String[] args) {
		Abstract1 t1 = new Abstract1();
		t1.add();
		
	}

}
