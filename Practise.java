package basicprograms;

import java.security.PublicKey;

public class Practise {
	void add() {
		System.out.println("add");
	}
	void substract () {
		System.out.println("substract");
	}
	static void divid () {
		System.out.println("divid");
	}
	static void multiply () {
		System.out.println("multiply");
	}
	
	static void multiply(int a) {
		System.out.println("overloading");
	}
	public static void main(String[] args) {
		Practise P1= new Practise();
		P1.add();
		P1.substract();
		divid();
		multiply(3);
		
		
	}
	

}
