package basicprograms;

public class Assigment36 
{
public static void main(String[] args) 
{
	String [] d1= {"devendra","mani",};
	String [] e1= {"devendra","mani","shweta"};
	System.out.println(d1.length);
	if(d1.length==e1.length) {
		for(int i = 0;i<d1.length;i++) {
			if(d1[i].equalsIgnoreCase(e1[i])) {
				System.out.println("The arrays are equal");
			}
			else {
				System.out.println("The elements in arrays are not equal");
			}
		}
		
	}
	else {
		System.out.println("Then length of the array is not equal");
	}
}
}
