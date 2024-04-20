package basicprograms;
public class CombineMethod
{
 void add()
 {
	 System.out.println("add");
	 
 }
 void substract() 
 {
	 System.out.println("substract");
 }
 static void multiple()
 {
	 
	 System.out.println("multiple");
 }
 static void divided() 
 {
	 System.out.println("divided");
 }
 public static void main(String[] args)
 {
	
	 CombineMethod c1=new CombineMethod();
	c1.add();
	CombineMethod c2=new CombineMethod();
	c2.substract();
	multiple();
	divided();
	
}
}
