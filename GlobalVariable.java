package basicprograms;
public class GlobalVariable 
	{
       int age =7;
       String name="test";
       double salary=50000;
       int addrewss=56;
       void add() 
       {
    	System.out.println(age);
    	System.out.println(name);
    	System.out.println(salary);
       }
       public static void main(String[] args) 
       {
    	   GlobalVariable g1=new GlobalVariable();
    	   g1.add();
 	   System.out.println(g1.addrewss);
    	   System.out.println(g1.name);
    	   System.out.println(g1.salary);
	}
	}


