package basicprograms;

public class Stringtest {
	 

	void TestDemo(char c) {
		System.out.println("I am character");
	}

	void TestDemo(String a) {
		System.out.println("I am String");

	}

	public static void main(String[] args) {
		char a ='A';
		Stringtest test =new Stringtest();
		test.TestDemo(a);
		test.TestDemo('a');
       
	}

}
