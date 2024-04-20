package basicprograms;
public  class Assignment 
{
	public Assignment()
	{
		System.out.println("Empty");
		
	}
	 Assignment (int a){
		System.out.println(a);
		
	}
	Assignment (char a){
		System.out.println("This is a char");
	}
	Assignment (boolean a)
	{
		System.out.println("3");
	}
	 Assignment(String test)
	 
	 {
		 System.out.println(test);
 }
public static void main(String[] args) 
	{   char sample ='A';
		System.out.println("hi");
		Assignment a1=new Assignment();	
		Assignment a2=new Assignment(5);
		Assignment a3=new Assignment("A");
		Assignment a4=new Assignment(true);
		
	}

}
