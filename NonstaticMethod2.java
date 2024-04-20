package basicprograms;
public class NonstaticMethod2 
{
void add() {
	String name = dev();
	System.out.println(name);
	
}

public String dev()
{
	return "Dev";
}

	public static void main(String[] args)
	{
	NonstaticMethod n1=new NonstaticMethod();
n1.add();
	}

}
