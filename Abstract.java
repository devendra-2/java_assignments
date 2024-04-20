package basicprograms;

public interface  Abstract
{
 public abstract void add();
 
 public default void sub() {
	 
 }
}
class devendra implements Abstract
{

	public void add() {
		System.out.println("hi");
		
	}
	public static void main(String[] args) 
	{
		devendra d1 =new devendra();
		d1.add();
		System.out.println("hi");
	
	}
	
	
	
}


