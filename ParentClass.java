package basicprograms;

public class ParentClass {
	static void add() {
		System.out.println("method one in parent calss");
	}
	void multi() {
		System.out.println("method 3 in parent class");
	}

	static void sub() {
		System.out.println("method two in parent calss");
	}
}
 class Childclass extends ParentClass
 {
	  void divid() {
		  System.out.println("this method is in child class");		  
	  }
	  static void dev() {
		  System.out.println("hi");
	  }
	  public static void main(String[] args) {
		System.out.println("main method");
		Childclass a1= new Childclass();
		ParentClass b1= new ParentClass();
		a1.multi();
		a1.divid();
		add();
		sub();
		dev();
	  }
		
				
				
				
				
 }
	

