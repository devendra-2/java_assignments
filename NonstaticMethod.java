package basicprograms;
public class NonstaticMethod 
{
	void add() {
		
		System.out.println("y");
	}
	
	public static void main(String[] args)
	{
	NonstaticMethod n1=new NonstaticMethod();
	n1.add();

	}

}
