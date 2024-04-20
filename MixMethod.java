package basicprograms;
public class MixMethod
{
  void add() {
	  System.out.println("are");
  }
  static void substract() {
	  System.out.println("you");
  }
  MixMethod(){
	  System.out.println("how");
  }
	public static void main(String[] args) 
	{
		
		
		MixMethod m1=new MixMethod();
		m1.add();
		substract();
 
		
		

	}

}
